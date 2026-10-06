package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phrhr06 extends GXProcedure
{
   public phrhr06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phrhr06.class ), "" );
   }

   public phrhr06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             byte[] aP13 )
   {
      phrhr06.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 )
   {
      phrhr06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phrhr06.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      phrhr06.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      phrhr06.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      phrhr06.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      phrhr06.this.A4545HreLinMaq = aP5[0];
      this.aP5 = aP5;
      phrhr06.this.A4550HreLinPro = aP6[0];
      this.aP6 = aP6;
      phrhr06.this.A4557HreRecLin = aP7[0];
      this.aP7 = aP7;
      phrhr06.this.AV9HrePrdcant = aP8[0];
      this.aP8 = aP8;
      phrhr06.this.AV8Hrecanany = aP9[0];
      this.aP9 = aP9;
      phrhr06.this.AV10HreFacCon = aP10[0];
      this.aP10 = aP10;
      phrhr06.this.AV11Prdnum = aP11[0];
      this.aP11 = aP11;
      phrhr06.this.AV12PrdNom = aP12[0];
      this.aP12 = aP12;
      phrhr06.this.AV13HrePrdUme = aP13[0];
      this.aP13 = aP13;
      phrhr06.this.AV14HrePrdUDs = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n4561HrePrdUDs = false ;
      n4560HrePrdUMe = false ;
      n4558HrePrdNum = false ;
      n719PrdNum = false ;
      n4559HrePrdDsc = false ;
      n4562HreFacCon = false ;
      n4563HrePrdCant = false ;
      n4565HreCanAny = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03MY2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n4561HrePrdUDs), AV14HrePrdUDs, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(AV13HrePrdUme), AV11Prdnum, AV11Prdnum, AV11Prdnum, AV11Prdnum, AV12PrdNom, AV11Prdnum, Boolean.valueOf(n4562HreFacCon), AV10HreFacCon, Boolean.valueOf(n4563HrePrdCant), AV9HrePrdcant, Boolean.valueOf(n4565HreCanAny), AV8Hrecanany, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phrhr06.this.A396EmprCod;
      this.aP1[0] = phrhr06.this.A4492HreBarCod;
      this.aP2[0] = phrhr06.this.A4493HreBarReo;
      this.aP3[0] = phrhr06.this.A4494HreBarPar;
      this.aP4[0] = phrhr06.this.A4495HreNumCie;
      this.aP5[0] = phrhr06.this.A4545HreLinMaq;
      this.aP6[0] = phrhr06.this.A4550HreLinPro;
      this.aP7[0] = phrhr06.this.A4557HreRecLin;
      this.aP8[0] = phrhr06.this.AV9HrePrdcant;
      this.aP9[0] = phrhr06.this.AV8Hrecanany;
      this.aP10[0] = phrhr06.this.AV10HreFacCon;
      this.aP11[0] = phrhr06.this.AV11Prdnum;
      this.aP12[0] = phrhr06.this.AV12PrdNom;
      this.aP13[0] = phrhr06.this.AV13HrePrdUme;
      this.aP14[0] = phrhr06.this.AV14HrePrdUDs;
      Application.commitDataStores(context, remoteHandle, pr_default, "phrhr06");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4561HrePrdUDs = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phrhr06__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private byte AV13HrePrdUme ;
   private byte A4560HrePrdUMe ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private java.math.BigDecimal AV9HrePrdcant ;
   private java.math.BigDecimal AV8Hrecanany ;
   private java.math.BigDecimal AV10HreFacCon ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV11Prdnum ;
   private String AV12PrdNom ;
   private String AV14HrePrdUDs ;
   private String A4561HrePrdUDs ;
   private boolean n4561HrePrdUDs ;
   private boolean n4560HrePrdUMe ;
   private boolean n4558HrePrdNum ;
   private boolean n719PrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean n4562HreFacCon ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private String[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private short[] aP5 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private byte[] aP13 ;
   private IDataStoreProvider pr_default ;
}

final  class phrhr06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03MY2", "UPDATE TXPHISLRE SET HrePrdUDs=?, HrePrdUMe=?, HrePrdNum=CASE  WHEN HrePrdNum <> ? THEN ? ELSE HrePrdNum END, PrdNum=CASE  WHEN PrdNum <> ? THEN ? ELSE PrdNum END, HrePrdDsc=CASE  WHEN PrdNum <> ? THEN ? ELSE HrePrdDsc END, HreFacCon=?, HrePrdCant=?, HreCanAny=?  WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? and HreRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               stmt.setString(3, (String)parms[4], 6);
               stmt.setString(4, (String)parms[5], 6);
               stmt.setString(5, (String)parms[6], 6);
               stmt.setString(6, (String)parms[7], 6);
               stmt.setString(7, (String)parms[8], 26);
               stmt.setString(8, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 3);
               }
               stmt.setString(12, (String)parms[16], 3);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               stmt.setByte(14, ((Number) parms[18]).byteValue());
               stmt.setString(15, (String)parms[19], 1);
               stmt.setByte(16, ((Number) parms[20]).byteValue());
               stmt.setShort(17, ((Number) parms[21]).shortValue());
               stmt.setByte(18, ((Number) parms[22]).byteValue());
               stmt.setShort(19, ((Number) parms[23]).shortValue());
               return;
      }
   }

}

