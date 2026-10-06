package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class updateproductohislreccstks extends GXProcedure
{
   public updateproductohislreccstks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( updateproductohislreccstks.class ), "" );
   }

   public updateproductohislreccstks( int remoteHandle ,
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
      updateproductohislreccstks.this.aP14 = new String[] {""};
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
      updateproductohislreccstks.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      updateproductohislreccstks.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      updateproductohislreccstks.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      updateproductohislreccstks.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      updateproductohislreccstks.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      updateproductohislreccstks.this.A4545HreLinMaq = aP5[0];
      this.aP5 = aP5;
      updateproductohislreccstks.this.A4550HreLinPro = aP6[0];
      this.aP6 = aP6;
      updateproductohislreccstks.this.A4557HreRecLin = aP7[0];
      this.aP7 = aP7;
      updateproductohislreccstks.this.AV9HrePrdcant = aP8[0];
      this.aP8 = aP8;
      updateproductohislreccstks.this.AV8Hrecanany = aP9[0];
      this.aP9 = aP9;
      updateproductohislreccstks.this.AV10HreFacCon = aP10[0];
      this.aP10 = aP10;
      updateproductohislreccstks.this.AV11Prdnum = aP11[0];
      this.aP11 = aP11;
      updateproductohislreccstks.this.AV12PrdNom = aP12[0];
      this.aP12 = aP12;
      updateproductohislreccstks.this.AV13HrePrdUme = aP13[0];
      this.aP13 = aP13;
      updateproductohislreccstks.this.AV14HrePrdUDs = aP14[0];
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
      n4562HreFacCon = false ;
      n4563HrePrdCant = false ;
      n4565HreCanAny = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AT32 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n4561HrePrdUDs), AV14HrePrdUDs, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(AV13HrePrdUme), Boolean.valueOf(n4562HreFacCon), AV10HreFacCon, Boolean.valueOf(n4563HrePrdCant), AV9HrePrdcant, Boolean.valueOf(n4565HreCanAny), AV8Hrecanany, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = updateproductohislreccstks.this.A396EmprCod;
      this.aP1[0] = updateproductohislreccstks.this.A4492HreBarCod;
      this.aP2[0] = updateproductohislreccstks.this.A4493HreBarReo;
      this.aP3[0] = updateproductohislreccstks.this.A4494HreBarPar;
      this.aP4[0] = updateproductohislreccstks.this.A4495HreNumCie;
      this.aP5[0] = updateproductohislreccstks.this.A4545HreLinMaq;
      this.aP6[0] = updateproductohislreccstks.this.A4550HreLinPro;
      this.aP7[0] = updateproductohislreccstks.this.A4557HreRecLin;
      this.aP8[0] = updateproductohislreccstks.this.AV9HrePrdcant;
      this.aP9[0] = updateproductohislreccstks.this.AV8Hrecanany;
      this.aP10[0] = updateproductohislreccstks.this.AV10HreFacCon;
      this.aP11[0] = updateproductohislreccstks.this.AV11Prdnum;
      this.aP12[0] = updateproductohislreccstks.this.AV12PrdNom;
      this.aP13[0] = updateproductohislreccstks.this.AV13HrePrdUme;
      this.aP14[0] = updateproductohislreccstks.this.AV14HrePrdUDs;
      Application.commitDataStores(context, remoteHandle, pr_default, "updateproductohislreccstks");
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.updateproductohislreccstks__default(),
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

final  class updateproductohislreccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AT32", "UPDATE TXPHISLRE SET HrePrdUDs=?, HrePrdUMe=?, HreFacCon=?, HrePrdCant=?, HreCanAny=?  WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? and HreRecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 3);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setByte(10, ((Number) parms[14]).byteValue());
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               stmt.setByte(12, ((Number) parms[16]).byteValue());
               stmt.setShort(13, ((Number) parms[17]).shortValue());
               return;
      }
   }

}

