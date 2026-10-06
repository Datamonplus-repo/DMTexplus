package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltpar extends GXProcedure
{
   public paltpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltpar.class ), "" );
   }

   public paltpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      paltpar.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      paltpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltpar.this.AV15PartCod = aP1[0];
      this.aP1 = aP1;
      paltpar.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      paltpar.this.AV17DisArtCod = aP3[0];
      this.aP3 = aP3;
      paltpar.this.AV19DisNMtr = aP4[0];
      this.aP4 = aP4;
      paltpar.this.AV20DisArtDsc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FlagBros = (byte)(0) ;
      GXv_int1[0] = AV18FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      paltpar.this.AV18FlagBros = GXv_int1[0] ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV21Rontaltex)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int1) ;
      paltpar.this.AV21Rontaltex = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXv_int1[0] = AV22Magosa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      paltpar.this.AV22Magosa = GXv_int1[0] ;
      if ( AV18FlagBros == 1 )
      {
         httpContext.wjLoc = formatLink("app.tpartid", new String[] {}, new String[] {})  ;
      }
      else
      {
         if ( AV21Rontaltex.doubleValue() == 1 )
         {
            httpContext.wjLoc = formatLink("app.tparrx1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV15PartCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV19DisNMtr)),GXutil.URLEncode(GXutil.rtrim(AV20DisArtDsc))}, new String[] {"EmprCod","Partid","CliCod","DisArtCod","DisNMtr","DisArtDsc"})  ;
         }
         else
         {
            httpContext.wjLoc = formatLink("app.tpartdi", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV15PartCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV19DisNMtr)),GXutil.URLEncode(GXutil.rtrim(AV20DisArtDsc))}, new String[] {})  ;
         }
      }
      if ( AV22Magosa == 1 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltpar.this.A396EmprCod;
      this.aP1[0] = paltpar.this.AV15PartCod;
      this.aP2[0] = paltpar.this.AV16CliCod;
      this.aP3[0] = paltpar.this.AV17DisArtCod;
      this.aP4[0] = paltpar.this.AV19DisNMtr;
      this.aP5[0] = paltpar.this.AV20DisArtDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Rontaltex = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18FlagBros ;
   private byte AV22Magosa ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int AV16CliCod ;
   private java.math.BigDecimal AV21Rontaltex ;
   private String A396EmprCod ;
   private String AV15PartCod ;
   private String AV17DisArtCod ;
   private String AV19DisNMtr ;
   private String AV20DisArtDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
}

