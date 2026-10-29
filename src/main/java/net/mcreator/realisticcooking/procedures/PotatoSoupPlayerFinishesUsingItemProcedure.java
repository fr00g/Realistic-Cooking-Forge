package net.mcreator.realisticcooking.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class PotatoSoupPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double trackx = 0;
		double tracky = 0;
		double trackz = 0;
		double grow = 0;
		Entity tracking = null;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + itemstack.getOrCreateTag().getDouble("Food")));
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Iron Pickaxe")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Gold Pickaxe")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 3, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Diamond Pickaxe")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 300, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Netherite Pickaxe")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 600, 5, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 5, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Iron Sword")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Iron Sword")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Gold Sword")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 3, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Diamond Sword")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Netherite Sword")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 5, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 5, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Ender Pearl")) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = initProjectileProperties(new ThrownEnderpearl(EntityType.ENDER_PEARL, projectileLevel), entity, Vec3.ZERO);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Rabbit Foot")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Diamond")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 3, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Netherite Ingot")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 5, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Chorus Fruit")) {
			{
				Entity _ent = entity;
				double _tx = (x + Mth.nextInt(RandomSource.create(), -6, 6));
				double _ty = (y + Mth.nextInt(RandomSource.create(), -6, 6));
				double _tz = (z + Mth.nextInt(RandomSource.create(), -6, 6));
				_ent.teleportTo(_tx, _ty, _tz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(_tx, _ty, _tz, _ent.getYRot(), _ent.getXRot());
			}
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Glistering Melon Slice")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Rabbit's Foot")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Sugar")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Pufferfish")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Magma Cream")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Golden Carrot")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Blaze Powder")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Ghast Tear")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Turtle Shell")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Phantom Membrane")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 2, false, false));
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Prismarine Shard")) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.guardian.attack")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.guardian.attack")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if ((findEntityInWorldRange(world, Spider.class, x, y, z, 100)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 600, 2, false, false));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Nearest Player:" + "\n" + (findEntityInWorldRange(world, Spider.class, x, y, z, 100)).getX() + " " + (findEntityInWorldRange(world, Spider.class, x, y, z, 100)).getY() + " "
						+ (findEntityInWorldRange(world, Spider.class, x, y, z, 100)).getZ())), false);
		}
		if ((itemstack.getOrCreateTag().getString("Desc")).contains("\u00A71Showcase Thing")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 60, 2, false, false));
		}
	}

	private static Projectile initProjectileProperties(Projectile entityToSpawn, Entity shooter, Vec3 acceleration) {
		entityToSpawn.setOwner(shooter);
		if (!Vec3.ZERO.equals(acceleration)) {
			entityToSpawn.setDeltaMovement(acceleration);
			entityToSpawn.hasImpulse = true;
		}
		return entityToSpawn;
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}