export interface Root {
    offerInfo: OfferInfo
    userInfo: UserInfo
    debugInfo: DebugInfo
    abInfo: AbInfo
    pricingSummaries: PricingSummaries
    offers: Offers
  }
  
  export interface OfferInfo {
    siteID: string
    language: string
    currency: string
  }
  
  export interface UserInfo {
    persona: Persona
    userId: string
  }
  
  export interface Persona {
    personaType: string
  }
  
  export interface DebugInfo {
    requestId: string
  }
  
  export interface AbInfo {
    displayDestinationAlternativeIsAvailable: string
  }
  
  export interface PricingSummaries {}
  
  export interface Offers {
    Package: Package[]
  }
  
  export interface Package {
    offerDateRange: OfferDateRange
    destination: Destination
    displayDestinationAlternativeIsAvailable: boolean
    hotelInfo: HotelInfo
    hotelPricingInfo: HotelPricingInfo
    flightInfo: FlightInfo
    flightPricingInfo: FlightPricingInfo
    packageInfo: PackageInfo
    packagePricingInfo: PackagePricingInfo
    packageUrls: PackageUrls
    origin: Origin
  }
  
  export interface OfferDateRange {
    travelStartDate: number[]
    travelEndDate: number[]
    formattedTravelStartDate: string
    formattedTravelEndDate: string
    lengthOfStay: number
  }
  
  export interface Destination {
    regionID: string
    longName: string
    continent: string
    country: string
    province: string
    city: string
    displayDestination: string
    flightDestination: string
    displayDestinationRegionId: string
    tla: string
    metrocode: string
    pointOfSaleRank: number
  }
  
  export interface HotelInfo {
    hotelId: string
    hotelName: string
    localizedHotelName: string
    hotelDestination: string
    hotelDestinationRegionID: string
    hotelLongDestination: string
    hotelStreetAddress: string
    hotelCity: string
    hotelProvince: string
    hotelCountryCode: string
    hotelLatitude: number
    hotelLongitude: number
    hotelStarRating: string
    hotelGuestReviewRating: number
    formattedHotelGuestReviewRating: string
    hotelReviewTotal: number
    formattedHotelReviewTotal: string
    hotelImageUrl: string
    bigHotelImageUrl: string
    vipIconUrl: string
    vipAccess: boolean
    enhancedCleaningAvailable: boolean
    isOfficialRating: boolean
  }
  
  export interface HotelPricingInfo {
    hotelPerPsgrBaseRate: number
    hotelPerPsgrTaxesAndFees: number
    hotelPerPsgrTotalRate: number
    hotelTotalBaseRate: number
    hotelTotalTaxesAndFees: number
    hotelTotalRate: number
    currency: string
    formattedTotalPriceValue: string
    displayAveragePrice: boolean
    drr: boolean
  }
  
  export interface FlightInfo {
    flightDealCarrier: string
    flightDealCarrierName: string
    lengthOfStay: number
    flightDealCarrierImageUrl: string
    flightDealCarrierImageUrlSqSvg: string
    tripType: string
  }
  
  export interface FlightPricingInfo {
    currencyCode: string
    flightTotalBaseFare: number
    flightTotalTax: number
    flightTotalPrice: number
    flightPerPsgrBaseFare: number
    flightPerPsgrTax: number
    flightPerPsgrBaseFarePlusTax: number
    flightPerPsgrTotalPrice: number
    trendAgcyFlightPrice: number
    pctChangeFromTrend: number
    formattedTotalPriceValue: string
  }
  
  export interface PackageInfo {
    brandedDealsIdentifier: string
  }
  
  export interface PackagePricingInfo {
    currencyCode: string
    perPsgrPackagePrice: number
    totalPackagePrice: number
    perPsgrSavings: number
    totalSavings: number
    percentSavings: number
    savingsPctOfHotel: number
    savingsPctOfFlight: number
    formattedPerPassengerPackagePrice: string
    formattedTotalPriceValue: string
  }
  
  export interface PackageUrls {
    packageSearchUrl: string
    decodedPackageSearchUrl: string
    similarSearchLink: string
    flightDeeplinks: FlightDeeplinks
    hotelDeeplinks: HotelDeeplinks
  }
  
  export interface FlightDeeplinks {
    flightSearchUrl: string
    decodedFlightSearchUrl: string
  }
  
  export interface HotelDeeplinks {
    hotelInfositeUrl: string
    hotelSearchResultUrl: string
    pinnedHotelSearchResultUrl: string
    decodedHotelInfositeUrl: string
    decodedHotelSearchResultUrl: string
    decodedHsrSortByVrUrl: string
    decodedPinnedHsrSortByRecommendedUrl: string
    decodedPinnedHsrSortByBestUrl: string
    decodedPinnedHsrSortByModUrl: string
    decodedPinnedHsrSortByVrUrl: string
    similarSearchLink: string
  }
  
  export interface Origin {
    regionID: string
    longName: string
    country: string
    province: string
    city: string
    tla: string
    source: string
  }
  