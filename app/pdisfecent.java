package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisfecent extends GXProcedure
{
   public pdisfecent( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisfecent.class ), "" );
   }

   public pdisfecent( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      pdisfecent.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pdisfecent.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisfecent.this.AV13DiasEnt = aP1[0];
      this.aP1 = aP1;
      pdisfecent.this.AV14Disfecent = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Disfecent = GXutil.dadd(GXutil.today( ),+((int)(AV13DiasEnt))) ;
      AV15Fecha1 = AV14Disfecent ;
      GXv_char1[0] = A396EmprCod ;
      GXv_date2[0] = AV15Fecha1 ;
      GXv_int3[0] = (short)(0) ;
      GXv_date4[0] = AV16Fecha2 ;
      new app.pfpddt(remoteHandle, context).execute( GXv_char1, GXv_date2, GXv_int3, GXv_date4) ;
      pdisfecent.this.A396EmprCod = GXv_char1[0] ;
      pdisfecent.this.AV15Fecha1 = GXv_date2[0] ;
      pdisfecent.this.AV16Fecha2 = GXv_date4[0] ;
      AV14Disfecent = AV16Fecha2 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisfecent.this.A396EmprCod;
      this.aP1[0] = pdisfecent.this.AV13DiasEnt;
      this.aP2[0] = pdisfecent.this.AV14Disfecent;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Fecha1 = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_date2 = new java.util.Date[1] ;
      GXv_int3 = new short[1] ;
      AV16Fecha2 = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13DiasEnt ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private java.util.Date AV14Disfecent ;
   private java.util.Date AV15Fecha1 ;
   private java.util.Date GXv_date2[] ;
   private java.util.Date AV16Fecha2 ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
}

