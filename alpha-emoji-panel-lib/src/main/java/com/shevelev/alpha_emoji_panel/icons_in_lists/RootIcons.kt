package com.shevelev.alpha_emoji_panel.icons_in_lists

import com.shevelev.alpha_emoji_panel.emojies.*
import java.lang.UnsupportedOperationException

/**
 * Creates full set of icons
 */
class RootIcons: GroupIconInGrid {
    /**
     *
     */
    private val rootIcons: List<GroupIconInGrid> by lazy {
        val result = mutableListOf<GroupIconInGrid>()

        // Smiles
        result.add(IconsSet(Emoji(0x1F600), Smiles.icons.map { SimpleIcon(it)}))

        // Masks
        result.add(IconsSet(Emoji(0x1F921), Masks.icons.map { SimpleIcon(it)}))

        // Cat faces
        result.add(IconsSet(Emoji(0x1F63A), CatFaces.icons.map { SimpleIcon(it)}))

        // Sun and moon faces
        result.add(IconsSet(Emoji(0x1F31E), SunAndMoonFaces.icons.map { SimpleIcon(it)}))

        // Evil monkey faces
        result.add(IconsSet(Emoji(0x1F648), EvilMonkey.icons.map { SimpleIcon(it)}))

        // Love
        result.add(IconsSet(Emoji(0x1F48B), Love.icons.map { SimpleIcon(it)}))

        // Symbols
        result.add(IconsSet(Emoji(0x1F4AF), Symbols.icons.map { SimpleIcon(it)}))

        // Hands
        val handsIcons = listOf(
            ComplexIcon(HandWithFingersSplayed.icons.map { SimpleIcon(it) }),
            ComplexIcon(WavingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(RaisedBackOfHHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(RaisedHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(VulcanSalute.icons.map { SimpleIcon(it) }),
            ComplexIcon(OkHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(PinchingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(VictoryHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(CrossedFingers.icons.map { SimpleIcon(it) }),
            ComplexIcon(LoveYouGesture.icons.map { SimpleIcon(it) }),
            ComplexIcon(SignOfTheHorns.icons.map { SimpleIcon(it) }),
            ComplexIcon(CallMeHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(BackhandIndexPointingLeft.icons.map { SimpleIcon(it) }),
            ComplexIcon(BackhandIndexPointingRight.icons.map { SimpleIcon(it) }),
            ComplexIcon(BackhandIndexPointingUp.icons.map { SimpleIcon(it) }),
            ComplexIcon(MiddleFinger.icons.map { SimpleIcon(it) }),
            ComplexIcon(BackhandIndexPointingDown.icons.map { SimpleIcon(it) }),
            ComplexIcon(IndexPointingUp.icons.map { SimpleIcon(it) }),
            ComplexIcon(ThumbsUp.icons.map { SimpleIcon(it) }),
            ComplexIcon(ThumbsDown.icons.map { SimpleIcon(it) }),
            ComplexIcon(RaisedFist.icons.map { SimpleIcon(it) }),
            ComplexIcon(OncomingFist.icons.map { SimpleIcon(it) }),
            ComplexIcon(LeftFacingFist.icons.map { SimpleIcon(it) }),
            ComplexIcon(RightFacingFist.icons.map { SimpleIcon(it) }),
            ComplexIcon(ClappingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(RaisingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(OpenHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(PalmsUpTogether.icons.map { SimpleIcon(it) }),
            ComplexIcon(Handshake.icons.map { SimpleIcon(it) }),
            ComplexIcon(FoldedHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(WritingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(NailPolish.icons.map { SimpleIcon(it) }),
            ComplexIcon(Selfie.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F91A), handsIcons))

        // Body parts
        val bodyPartsIcons = listOf(
            ComplexIcon(Leg.icons.map { SimpleIcon(it) }),
            ComplexIcon(FlexedBiceps.icons.map { SimpleIcon(it) }),
            ComplexIcon(Foot.icons.map { SimpleIcon(it) }),
            ComplexIcon(Ear.icons.map { SimpleIcon(it) }),
            ComplexIcon(EarWithHearingAid.icons.map { SimpleIcon(it) }),
            ComplexIcon(Nose.icons.map { SimpleIcon(it) })
        )
        .union(BodyParts.icons.map { SimpleIcon(it) })
        .union(MechanicalLimbs.icons.map { SimpleIcon(it) })
        .toList()
        result.add(IconsSet(Emoji(0x1F440), bodyPartsIcons))

        // Persons
        val personIcons = listOf(
            ComplexIcon(Baby.icons.map { SimpleIcon(it) }),
            ComplexIcon(Child.icons.map { SimpleIcon(it) }),
            ComplexIcon(Boy.icons.map { SimpleIcon(it) }),
            ComplexIcon(Girl.icons.map { SimpleIcon(it) }),
//            ComplexIcon(Person.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonBlondHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(Man.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBeard.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBlondHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManRedHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManCurlyHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManWhiteHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBald.icons.map { SimpleIcon(it) }),
            ComplexIcon(Woman.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanBlondHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanRedHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanCurlyHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanWhiteHair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanBald.icons.map { SimpleIcon(it) }),
//            ComplexIcon(OlderPerson.icons.map { SimpleIcon(it) }),
            ComplexIcon(OldMan.icons.map { SimpleIcon(it) }),
            ComplexIcon(OldWoman.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonFrowning.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFrowning.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFrowning.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonPouting.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManPouting.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanPouting.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonGesturingNo.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGesturingNo.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGesturingNo.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonGesturingOk.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGesturingOk.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGesturingOk.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonTippingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManTippingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanTippingHand.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonRaisingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManRaisingHand.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanRaisingHand.icons.map { SimpleIcon(it) }),
//            ComplexIcon(DeafPerson.icons.map { SimpleIcon(it) }),
            ComplexIcon(DeafMan.icons.map { SimpleIcon(it) }),
            ComplexIcon(DeafWoman.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonBowing.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBowing.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanBowing.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonFacepalming.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFacepalming.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFacepalming.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonShrugging.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManShrugging.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanShrugging.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonGettingMassage.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGettingMassage.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGettingMassage.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonGettingHaircut.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGettingHaircut.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGettingHaircut.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F9D1), personIcons))

        // Occupation
        val occupationIcons = listOf(
            ComplexIcon(ManHealthWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanHealthWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManStudent.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanStudent.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManTeacher.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanTeacher.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManJudge.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanJudge.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFarmer.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFarmer.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManCook.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanCook.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManMechanic.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanMechanic.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFactoryWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFactoryWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManOfficeWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanOfficeWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManScientist.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanScientist.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManTechnologist.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanTechnologist.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManSinger.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanSinger.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManArtist.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanArtist.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManPilot.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanPilot.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManAstronaut.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanAstronaut.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFirefighter.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFirefighter.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PoliceOfficer.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManPoliceOfficer.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanPoliceOfficer.icons.map { SimpleIcon(it) }),
//            ComplexIcon(Detective.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManDetective.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanDetective.icons.map { SimpleIcon(it) }),
//            ComplexIcon(Guard.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGuard.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGuard.icons.map { SimpleIcon(it) }),
//            ComplexIcon(ConstructionWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManConstructionWorker.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanConstructionWorker.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F468, 0x200D, 0x1F373), occupationIcons))

        // Fairy
        val fairyIcons = listOf(
            ComplexIcon(Prince.icons.map { SimpleIcon(it) }),
            ComplexIcon(Princess.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonWearingTurban.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManWearingTurban.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanWearingTurban.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManWithChineseCap.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanWithHeadscarf.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInTuxedo.icons.map { SimpleIcon(it) }),
            ComplexIcon(BrideWithVeil.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F934), fairyIcons))

        // Motherhood
        val motherhoodIcons = listOf(
            ComplexIcon(PregnantWoman.icons.map { SimpleIcon(it) }),
            ComplexIcon(BreastFeeding.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F930), motherhoodIcons))

        // Fairy persons
        val fairyPersonIcons = listOf(
            ComplexIcon(BabyAngel.icons.map { SimpleIcon(it) }),
            ComplexIcon(SantaClaus.icons.map { SimpleIcon(it) }),
            ComplexIcon(MrsClaus.icons.map { SimpleIcon(it) }),
            ComplexIcon(Superhero.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManSuperhero.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanSuperhero.icons.map { SimpleIcon(it) }),
            ComplexIcon(Supervillain.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManSupervillain.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanSupervillain.icons.map { SimpleIcon(it) }),
            ComplexIcon(Mage.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManMage.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanMage.icons.map { SimpleIcon(it) }),
            ComplexIcon(Fairy.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManFairy.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanFairy.icons.map { SimpleIcon(it) }),
            ComplexIcon(Vampire.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManVampire.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanVampire.icons.map { SimpleIcon(it) }),
            ComplexIcon(Merperson.icons.map { SimpleIcon(it) }),
            ComplexIcon(Merman.icons.map { SimpleIcon(it) }),
            ComplexIcon(Mermaid.icons.map { SimpleIcon(it) }),
            ComplexIcon(Elf.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManElf.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanElf.icons.map { SimpleIcon(it) }),
            ComplexIcon(Genie.icons.map { SimpleIcon(it) }),
            ComplexIcon(Zombie.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F385), fairyPersonIcons))

        // Activities
        val activities = listOf(
//            ComplexIcon(PersonWalking.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManWalking.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanWalking.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonStanding.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManStanding.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanStanding.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonKneeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManKneeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanKneeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManWithProbingCane.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanWithProbingCane.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInMotorizedWheelchair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanInMotorizedWheelchair.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInManualWheelchair.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanInManualWheelchair.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonRunning.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManRunning.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanRunning.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManDancing.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanDancing.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInSuitLevitating.icons.map { SimpleIcon(it) }),
            ComplexIcon(PeopleWithBunnyEars.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonInSteamyRoom.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInSteamyRoom.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanInSteamyRoom.icons.map { SimpleIcon(it) }),
            ComplexIcon(MenWithBunnyEarsPartying.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomenWithBunnyEarsPartying.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonClimbing.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManClimbing.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanClimbing.icons.map { SimpleIcon(it) }),
            ComplexIcon(PersonFencing.icons.map { SimpleIcon(it) }),
            ComplexIcon(HorseRacing.icons.map { SimpleIcon(it) }),
            ComplexIcon(Skier.icons.map { SimpleIcon(it) }),
            ComplexIcon(Snowboarder.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonGolfing.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManGolfing.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanGolfing.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonSurfing.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManSurfing.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanSurfing.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonRowingBoat.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManRowingBoat.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanRowingBoat.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonSwimming.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManSwimming.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanSwimming.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonBouncingBall.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBouncingBall.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanBouncingBall.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonLiftingWeights.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManLiftingWeights.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanLiftingWeights.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonBiking.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManBiking.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanBiking.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonMountainBiking.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManMountainBiking.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanMountainBiking.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonCartwheeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManCartwheeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanCartwheeling.icons.map { SimpleIcon(it) }),
            ComplexIcon(PeopleWrestling.icons.map { SimpleIcon(it) }),
            ComplexIcon(Wrestlers.icons.map { SimpleIcon(it) }),
            ComplexIcon(MenWrestling.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomenWrestling.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonPlayingWaterPolo.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManPlayingWaterPolo.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanPlayingWaterPolo.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonPlayingHandball.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManPlayingHandball.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanPlayingHandball.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonJuggling.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManJuggling.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanJuggling.icons.map { SimpleIcon(it) }),
//            ComplexIcon(PersonInLotusPosition.icons.map { SimpleIcon(it) }),
            ComplexIcon(ManInLotusPosition.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanInLotusPosition.icons.map { SimpleIcon(it) }),
            ComplexIcon(PersonTakingBath.icons.map { SimpleIcon(it) }),
            ComplexIcon(PersonInBed.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F3C3), activities))

        // Love
        val love = listOf(
            ComplexIcon(PeopleHoldingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomenHoldingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(WomanAndManHoldingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(MenHoldingHands.icons.map { SimpleIcon(it) }),
            ComplexIcon(Kiss.icons.map { SimpleIcon(it) }),
            ComplexIcon(CoupleWithHeart.icons.map { SimpleIcon(it) })
        )
        result.add(IconsSet(Emoji(0x1F48F), love))

        // Family
        result.add(IconsSet(Emoji(0x1F46A), Family.icons.map { SimpleIcon(it)}))

        // Animals
        result.add(IconsSet(Emoji(0x1F431), Animals.icons.map { SimpleIcon(it)}))

        // Flowers
        result.add(IconsSet(Emoji(0x1F490), Flowers.icons.map { SimpleIcon(it)}))

        // Plants
        result.add(IconsSet(Emoji(0x1F332), Plants.icons.map { SimpleIcon(it)}))

        // Fruits
        result.add(IconsSet(Emoji(0x1F34E), Fruits.icons.map { SimpleIcon(it)}))

        // Food
        val food = Food.icons.map { SimpleIcon(it)}
            .union(Catlery.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F355), food))

        // Travelling
        val travelling = Travelling.icons.map { SimpleIcon(it)}
            .union(TouristPlaces.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F30E), travelling))

        // City objects
        val cityObjects = Entertaiment.icons.map { SimpleIcon(it)}
            .union(CityTransportObjects.icons.map { SimpleIcon(it)})
            .union(TransportExt.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F3AA), cityObjects))

        // Land transport
        val landTransport = Trains.icons.map { SimpleIcon(it)}
            .union(CityPublicTransport.icons.map { SimpleIcon(it)})
            .union(Cars.icons.map { SimpleIcon(it)})
            .union(Motorcycles.icons.map { SimpleIcon(it)})
            .union(Wheelchair.icons.map { SimpleIcon(it)})
            .union(Bicycles.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F68C), landTransport))

        // Ships
        result.add(IconsSet(Emoji(0x1F6A2), Ships.icons.map { SimpleIcon(it)}))

        // Air & space
        val airAndSpace = Airplanes.icons.map {SimpleIcon(it) as IconInGrid}
            .union(Space.icons.map { SimpleIcon(it) as IconInGrid})
            .toMutableList()
        airAndSpace.add(ComplexIcon(Moon.icons.map { SimpleIcon(it)}))
        result.add(IconsSet(Emoji(0x2708, 0xFE0F), airAndSpace))

        // Clocks
        result.add(IconsSet(Emoji(0x1F558), Clocks.icons.map { SimpleIcon(it)}))

        // Weather
        result.add(IconsSet(Emoji(0x26C5), Weather.icons.map { SimpleIcon(it)}))

        // Parties
        result.add(IconsSet(Emoji(0x1F384), Parties.icons.map { SimpleIcon(it)}))

        // Sport
        result.add(IconsSet(Emoji(0x26BD), Sport.icons.map { SimpleIcon(it)}))

        // Shopping
        val shopping = Clothes.icons.map { SimpleIcon(it)}
            .union(Shoes.icons.map { SimpleIcon(it)})
            .union(Shopping.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F455), shopping))

        // Games
        result.add(IconsSet(Emoji(0x1F3B2), Games.icons.map { SimpleIcon(it)}))

        // Sounds & Music
        result.add(IconsSet(Emoji(0x1F3B5), Sounds.icons.map { SimpleIcon(it)}))

        // Devices
        val devices = Devices.icons.map { SimpleIcon(it)}
            .union(Movies.icons.map { SimpleIcon(it)})
            .union(PlayerButtons.icons.map { SimpleIcon(it)})
            .union(ComputerSimbols.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F4F1), devices))

        // Lanterns
        result.add(IconsSet(Emoji(0x1F4A1), Lanterns.icons.map { SimpleIcon(it)}))

        // Books
        result.add(IconsSet(Emoji(0x1F4D5), Books.icons.map { SimpleIcon(it)}))

        // Money
        result.add(IconsSet(Emoji(0x1F4B5), Money.icons.map { SimpleIcon(it)}))

        // Mail
        result.add(IconsSet(Emoji(0x1F4E7), Mail.icons.map { SimpleIcon(it)}))

        // Office
        result.add(IconsSet(Emoji(0x1F4C5), Office.icons.map { SimpleIcon(it)}))

        // Tools
        val tools = Tools.icons.map { SimpleIcon(it)}
            .union(LockAndKeys.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F528), tools))

        // Weapons
        result.add(IconsSet(Emoji(0x1F3F9), Weapons.icons.map { SimpleIcon(it)}))

        // Science & Medicine
        val science = Science.icons.map { SimpleIcon(it)}
            .union(Medicine.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F48A), science))

        // Signboards
        result.add(IconsSet(Emoji(0x1F6BB), Signboards.icons.map { SimpleIcon(it)}))

        // Religion
        result.add(IconsSet(Emoji(0x271D, 0xFE0F), Religion.icons.map { SimpleIcon(it)}))

        // Zodiac
        result.add(IconsSet(Emoji(0x2649), Zodiac.icons.map { SimpleIcon(it)}))

        // Abstract
        val abstract = SpeakingHead.icons.map { SimpleIcon(it)}
            .union(BustsInSilhouette.icons.map { SimpleIcon(it)})
            .union(Footprints.icons.map { SimpleIcon(it)})
            .union(Abstract.icons.map { SimpleIcon(it)})
            .toList()
        result.add(IconsSet(Emoji(0x1F536), abstract))

        // Flags
        result.add(IconsSet(Emoji(0x1F1FA, 0x1F1F8), Flags.icons.map { SimpleIcon(it)}))

        // Digits
        result.add(IconsSet(Emoji(0x31, 0xFE0F), Digits.icons.map { SimpleIcon(it)}))

        result
    }

    /**
     *
     */
    override fun getChildIcons(): List<IconInGrid> = rootIcons

    /**
     *
     */
    override val icon: Emoji
        get() = throw UnsupportedOperationException("The icon is not supported for this entity")
}