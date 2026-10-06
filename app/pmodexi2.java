package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodexi2 extends GXProcedure
{
   public pmodexi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodexi2.class ), "" );
   }

   public pmodexi2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pmodexi2.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pmodexi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodexi2.this.AV19PrdNum = aP1[0];
      this.aP1 = aP1;
      pmodexi2.this.AV17FecRec = aP2[0];
      this.aP2 = aP2;
      pmodexi2.this.AV15ExiReaAlm = aP3[0];
      this.aP3 = aP3;
      pmodexi2.this.AV16ExiReaCC = aP4[0];
      this.aP4 = aP4;
      pmodexi2.this.AV18Preco_mov = aP5[0];
      this.aP5 = aP5;
      pmodexi2.this.AV20recFecHr = aP6[0];
      this.aP6 = aP6;
      pmodexi2.this.AV21RecUbic = aP7[0];
      this.aP7 = aP7;
      pmodexi2.this.AV22RecLot = aP8[0];
      this.aP8 = aP8;
      pmodexi2.this.AV21RecUbic = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03BH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV19PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03BH2_A719PrdNum[0] ;
         A704PrdExiAlm = P03BH2_A704PrdExiAlm[0] ;
         A705PrdExiCC = P03BH2_A705PrdExiCC[0] ;
         A727PrdRec = P03BH2_A727PrdRec[0] ;
         A10881PrdLote = P03BH2_A10881PrdLote[0] ;
         A704PrdExiAlm = AV15ExiReaAlm ;
         A705PrdExiCC = AV16ExiReaCC ;
         A727PrdRec = httpContext.getMessage( "N", "") ;
         A10881PrdLote = AV22RecLot ;
         /* Optimized UPDATE. */
         /* Using cursor P03BH3 */
         pr_default.execute(1, new Object[] {AV22RecLot, AV21RecUbic, AV16ExiReaCC, AV15ExiReaAlm, A396EmprCod, A719PrdNum, AV17FecRec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
         /* End optimized UPDATE. */
         /* Using cursor P03BH4 */
         pr_default.execute(2, new Object[] {A704PrdExiAlm, A705PrdExiCC, A727PrdRec, A10881PrdLote, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n8583RecInvSt = false ;
      n12286RecLot2 = false ;
      n8581RecExRcc = false ;
      n8579RecExRea = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03BH5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n12286RecLot2), AV22RecLot, Boolean.valueOf(n8581RecExRcc), AV16ExiReaCC, Boolean.valueOf(n8579RecExRea), AV15ExiReaAlm, A396EmprCod, AV19PrdNum, AV20recFecHr});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodexi2.this.A396EmprCod;
      this.aP1[0] = pmodexi2.this.AV19PrdNum;
      this.aP2[0] = pmodexi2.this.AV17FecRec;
      this.aP3[0] = pmodexi2.this.AV15ExiReaAlm;
      this.aP4[0] = pmodexi2.this.AV16ExiReaCC;
      this.aP5[0] = pmodexi2.this.AV18Preco_mov;
      this.aP6[0] = pmodexi2.this.AV20recFecHr;
      this.aP7[0] = pmodexi2.this.AV21RecUbic;
      this.aP8[0] = pmodexi2.this.AV22RecLot;
      this.aP9[0] = pmodexi2.this.AV21RecUbic;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodexi2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P03BH2_A396EmprCod = new String[] {""} ;
      P03BH2_A719PrdNum = new String[] {""} ;
      P03BH2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BH2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03BH2_A727PrdRec = new String[] {""} ;
      P03BH2_A10881PrdLote = new String[] {""} ;
      A719PrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A10881PrdLote = "" ;
      A12285RecLot = "" ;
      A11195RecUbic = "" ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A12286RecLot2 = "" ;
      A8581RecExRcc = DecimalUtil.ZERO ;
      A8579RecExRea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodexi2__default(),
         new Object[] {
             new Object[] {
            P03BH2_A396EmprCod, P03BH2_A719PrdNum, P03BH2_A704PrdExiAlm, P03BH2_A705PrdExiCC, P03BH2_A727PrdRec, P03BH2_A10881PrdLote
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV15ExiReaAlm ;
   private java.math.BigDecimal AV16ExiReaCC ;
   private java.math.BigDecimal AV18Preco_mov ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A8581RecExRcc ;
   private java.math.BigDecimal A8579RecExRea ;
   private String A396EmprCod ;
   private String AV19PrdNum ;
   private String AV21RecUbic ;
   private String AV22RecLot ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String A10881PrdLote ;
   private String A12285RecLot ;
   private String A11195RecUbic ;
   private String A12286RecLot2 ;
   private java.util.Date AV20recFecHr ;
   private java.util.Date AV17FecRec ;
   private boolean n8583RecInvSt ;
   private boolean n12286RecLot2 ;
   private boolean n8581RecExRcc ;
   private boolean n8579RecExRea ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BH2_A396EmprCod ;
   private String[] P03BH2_A719PrdNum ;
   private java.math.BigDecimal[] P03BH2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P03BH2_A705PrdExiCC ;
   private String[] P03BH2_A727PrdRec ;
   private String[] P03BH2_A10881PrdLote ;
}

final  class pmodexi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BH2", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdExiCC, PrdRec, PrdLote FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03BH3", "UPDATE TXPRECUEN SET RecEstInv=1, RecLot=?, RecUbic=?, RecExiRcc=?, RecExiRea=?  WHERE EmprCod = ? and PrdNum = ? and RecFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECUEN")
         ,new UpdateCursor("P03BH4", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdExiCC=?, PrdRec=?, PrdLote=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P03BH5", "UPDATE TXPINVPRD SET RecInvSt=1, RecLot2=?, RecExRcc=?, RecExRea=?  WHERE EmprCod = ? and PrdNum = ? and RecFecHr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVPRD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 6);
               stmt.setDateTime(6, (java.util.Date)parms[8], false);
               return;
      }
   }

}

