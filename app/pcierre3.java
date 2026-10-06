package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcierre3 extends GXProcedure
{
   public pcierre3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcierre3.class ), "" );
   }

   public pcierre3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 )
   {
      pcierre3.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      pcierre3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcierre3.this.AV11XToOco = aP1[0];
      this.aP1 = aP1;
      pcierre3.this.AV10Ok = aP2[0];
      this.aP2 = aP2;
      pcierre3.this.Gx_err = aP3[0];
      this.aP3 = aP3;
      pcierre3.this.Gx_emsg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14XToOCoNat = GXutil.trim( GXutil.substring( AV11XToOco, 1, 6)) ;
      AV12XToOCoCod = GXutil.trim( GXutil.substring( AV11XToOco, 8, 6)) ;
      AV13XToOCoItm = GXutil.trim( GXutil.substring( AV11XToOco, 15, 4)) ;
      AV17GXLvl4 = (byte)(0) ;
      /* Using cursor P00PE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV12XToOCoCod, AV13XToOCoItm, AV14XToOCoNat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10140XToOCoItm = P00PE2_A10140XToOCoItm[0] ;
         A10139XToOCoCod = P00PE2_A10139XToOCoCod[0] ;
         A10210XToOCoNat = P00PE2_A10210XToOCoNat[0] ;
         n10210XToOCoNat = P00PE2_n10210XToOCoNat[0] ;
         A10218XToOCoCnt = P00PE2_A10218XToOCoCnt[0] ;
         n10218XToOCoCnt = P00PE2_n10218XToOCoCnt[0] ;
         AV17GXLvl4 = (byte)(1) ;
         A10218XToOCoCnt = DecimalUtil.doubleToDec(0) ;
         n10218XToOCoCnt = false ;
         AV10Ok = (byte)(1) ;
         /* Using cursor P00PE3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10218XToOCoCnt), A10218XToOCoCnt, A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCo");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl4 == 0 )
      {
         AV10Ok = (byte)(0) ;
         Gx_err = (short)(1) ;
         Gx_emsg = httpContext.getMessage( "Orden de Compra no encontrada (", "") + AV12XToOCoCod + "/" + AV13XToOCoItm + ")" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcierre3.this.A396EmprCod;
      this.aP1[0] = pcierre3.this.AV11XToOco;
      this.aP2[0] = pcierre3.this.AV10Ok;
      this.aP3[0] = pcierre3.this.Gx_err;
      this.aP4[0] = pcierre3.this.Gx_emsg;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcierre3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14XToOCoNat = "" ;
      AV12XToOCoCod = "" ;
      AV13XToOCoItm = "" ;
      scmdbuf = "" ;
      P00PE2_A396EmprCod = new String[] {""} ;
      P00PE2_A10140XToOCoItm = new String[] {""} ;
      P00PE2_A10139XToOCoCod = new String[] {""} ;
      P00PE2_A10210XToOCoNat = new String[] {""} ;
      P00PE2_n10210XToOCoNat = new boolean[] {false} ;
      P00PE2_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00PE2_n10218XToOCoCnt = new boolean[] {false} ;
      A10140XToOCoItm = "" ;
      A10139XToOCoCod = "" ;
      A10210XToOCoNat = "" ;
      A10218XToOCoCnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcierre3__default(),
         new Object[] {
             new Object[] {
            P00PE2_A396EmprCod, P00PE2_A10140XToOCoItm, P00PE2_A10139XToOCoCod, P00PE2_A10210XToOCoNat, P00PE2_n10210XToOCoNat, P00PE2_A10218XToOCoCnt, P00PE2_n10218XToOCoCnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Ok ;
   private byte AV17GXLvl4 ;
   private short Gx_err ;
   private java.math.BigDecimal A10218XToOCoCnt ;
   private String A396EmprCod ;
   private String AV11XToOco ;
   private String Gx_emsg ;
   private String AV14XToOCoNat ;
   private String AV12XToOCoCod ;
   private String AV13XToOCoItm ;
   private String scmdbuf ;
   private String A10140XToOCoItm ;
   private String A10139XToOCoCod ;
   private String A10210XToOCoNat ;
   private boolean n10210XToOCoNat ;
   private boolean n10218XToOCoCnt ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00PE2_A396EmprCod ;
   private String[] P00PE2_A10140XToOCoItm ;
   private String[] P00PE2_A10139XToOCoCod ;
   private String[] P00PE2_A10210XToOCoNat ;
   private boolean[] P00PE2_n10210XToOCoNat ;
   private java.math.BigDecimal[] P00PE2_A10218XToOCoCnt ;
   private boolean[] P00PE2_n10218XToOCoCnt ;
}

final  class pcierre3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PE2", "SELECT EmprCod, XToOCoItm, XToOCoCod, XToOCoNat, XToOCoCnt FROM TXPXToOCo WHERE (EmprCod = ? and XToOCoCod = ? and XToOCoItm = ?) AND (XToOCoNat = ?) ORDER BY EmprCod, XToOCoCod, XToOCoItm ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00PE3", "UPDATE TXPXToOCo SET XToOCoCnt=?  WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXToOCo")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 4);
               return;
      }
   }

}

