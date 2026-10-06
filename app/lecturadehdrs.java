package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lecturadehdrs extends GXProcedure
{
   public lecturadehdrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lecturadehdrs.class ), "" );
   }

   public lecturadehdrs( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      lecturadehdrs.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      lecturadehdrs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      lecturadehdrs.this.AV29TablaHdrs_SDTJson = aP1[0];
      this.aP1 = aP1;
      lecturadehdrs.this.AV31usurcod = aP2[0];
      this.aP2 = aP2;
      lecturadehdrs.this.AV22station = aP3[0];
      this.aP3 = aP3;
      lecturadehdrs.this.AV34PgmnameIN = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33tabla_hdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV19i = (short)(1) ;
      AV27TablaHdrs_SDT.fromJSonString(AV29TablaHdrs_SDTJson, null);
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV27TablaHdrs_SDT.size() )
      {
         AV25TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)((app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)AV27TablaHdrs_SDT.elementAt(-1+AV37GXV1));
         AV9Barcod = AV25TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod() ;
         AV13Barcodreo = AV25TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo() ;
         AV11Barcodpar = AV25TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar() ;
         /* Using cursor P0AJQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV13Barcodreo), AV11Barcodpar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P0AJQ2_A130BarCodPar[0] ;
            A132BarCodReo = P0AJQ2_A132BarCodReo[0] ;
            A129BarCod = P0AJQ2_A129BarCod[0] ;
            A120BarAgrEst = P0AJQ2_A120BarAgrEst[0] ;
            if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
            {
               /* Using cursor P0AJQ3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A122BarAgrPar = P0AJQ3_A122BarAgrPar[0] ;
                  A124BarAgrReo = P0AJQ3_A124BarAgrReo[0] ;
                  A119BarAgrCod = P0AJQ3_A119BarAgrCod[0] ;
                  AV33tabla_hdrs[AV19i-1] = GXutil.str( A119BarAgrCod, 8, 0) + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                  AV19i = (short)(AV19i+1) ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
      if ( AV19i > 1 )
      {
         new app.pedidosclientesindetalle.controldatoshdragrupadas(remoteHandle, context).execute( A396EmprCod, AV33tabla_hdrs, AV31usurcod, AV22station, AV34PgmnameIN) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = lecturadehdrs.this.A396EmprCod;
      this.aP1[0] = lecturadehdrs.this.AV29TablaHdrs_SDTJson;
      this.aP2[0] = lecturadehdrs.this.AV31usurcod;
      this.aP3[0] = lecturadehdrs.this.AV22station;
      this.aP4[0] = lecturadehdrs.this.AV34PgmnameIN;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33tabla_hdrs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33tabla_hdrs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV25TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV11Barcodpar = "" ;
      scmdbuf = "" ;
      P0AJQ2_A396EmprCod = new String[] {""} ;
      P0AJQ2_A130BarCodPar = new String[] {""} ;
      P0AJQ2_A132BarCodReo = new byte[1] ;
      P0AJQ2_A129BarCod = new int[1] ;
      P0AJQ2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      P0AJQ3_A396EmprCod = new String[] {""} ;
      P0AJQ3_A129BarCod = new int[1] ;
      P0AJQ3_A132BarCodReo = new byte[1] ;
      P0AJQ3_A130BarCodPar = new String[] {""} ;
      P0AJQ3_A122BarAgrPar = new String[] {""} ;
      P0AJQ3_A124BarAgrReo = new byte[1] ;
      P0AJQ3_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lecturadehdrs__default(),
         new Object[] {
             new Object[] {
            P0AJQ2_A396EmprCod, P0AJQ2_A130BarCodPar, P0AJQ2_A132BarCodReo, P0AJQ2_A129BarCod, P0AJQ2_A120BarAgrEst
            }
            , new Object[] {
            P0AJQ3_A396EmprCod, P0AJQ3_A129BarCod, P0AJQ3_A132BarCodReo, P0AJQ3_A130BarCodPar, P0AJQ3_A122BarAgrPar, P0AJQ3_A124BarAgrReo, P0AJQ3_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short AV19i ;
   private short Gx_err ;
   private int GX_I ;
   private int AV37GXV1 ;
   private int AV9Barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private String A396EmprCod ;
   private String AV31usurcod ;
   private String AV22station ;
   private String AV33tabla_hdrs[] ;
   private String AV11Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A122BarAgrPar ;
   private String AV29TablaHdrs_SDTJson ;
   private String AV34PgmnameIN ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJQ2_A396EmprCod ;
   private String[] P0AJQ2_A130BarCodPar ;
   private byte[] P0AJQ2_A132BarCodReo ;
   private int[] P0AJQ2_A129BarCod ;
   private String[] P0AJQ2_A120BarAgrEst ;
   private String[] P0AJQ3_A396EmprCod ;
   private int[] P0AJQ3_A129BarCod ;
   private byte[] P0AJQ3_A132BarCodReo ;
   private String[] P0AJQ3_A130BarCodPar ;
   private String[] P0AJQ3_A122BarAgrPar ;
   private byte[] P0AJQ3_A124BarAgrReo ;
   private int[] P0AJQ3_A119BarAgrCod ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV27TablaHdrs_SDT ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV25TabladeHdrs_SDTItem ;
}

final  class lecturadehdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJQ2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJQ3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

