package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptaes01 extends GXProcedure
{
   public pptaes01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptaes01.class ), "" );
   }

   public pptaes01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            short[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            short[] aP6 )
   {
      pptaes01.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 )
   {
      pptaes01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptaes01.this.AV17TaesId = aP1[0];
      this.aP1 = aP1;
      pptaes01.this.AV18TaesDc = aP2[0];
      this.aP2 = aP2;
      pptaes01.this.AV19TaesLn = aP3[0];
      this.aP3 = aP3;
      pptaes01.this.AV20TaesVi = aP4[0];
      this.aP4 = aP4;
      pptaes01.this.AV21TaesVf = aP5[0];
      this.aP5 = aP5;
      pptaes01.this.AV22TaesLnP = aP6[0];
      this.aP6 = aP6;
      pptaes01.this.AV22TaesLnP = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14LastUlt = (short)(0) ;
      /* Using cursor P04NU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17TaesId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11634TaesId = P04NU2_A11634TaesId[0] ;
         A11642TaesCant = P04NU2_A11642TaesCant[0] ;
         n11642TaesCant = P04NU2_n11642TaesCant[0] ;
         A11637TaesLn = P04NU2_A11637TaesLn[0] ;
         A2144UniEstCod = P04NU2_A2144UniEstCod[0] ;
         n2144UniEstCod = P04NU2_n2144UniEstCod[0] ;
         A719PrdNum = P04NU2_A719PrdNum[0] ;
         n719PrdNum = P04NU2_n719PrdNum[0] ;
         A11641TaesLnP = P04NU2_A11641TaesLnP[0] ;
         W396EmprCod = A396EmprCod ;
         W11634TaesId = A11634TaesId ;
         if ( ( AV14LastUlt != A11637TaesLn ) && ( AV14LastUlt != 0 ) )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV22TaesLnP = A11641TaesLnP ;
         /*
            INSERT RECORD ON TABLE TXPTAES02

         */
         W396EmprCod = A396EmprCod ;
         W11634TaesId = A11634TaesId ;
         W11637TaesLn = A11637TaesLn ;
         W11641TaesLnP = A11641TaesLnP ;
         W719PrdNum = A719PrdNum ;
         n719PrdNum = false ;
         W11642TaesCant = A11642TaesCant ;
         n11642TaesCant = false ;
         W2144UniEstCod = A2144UniEstCod ;
         n2144UniEstCod = false ;
         A11634TaesId = AV17TaesId ;
         A11637TaesLn = AV19TaesLn ;
         n719PrdNum = false ;
         A11642TaesCant = DecimalUtil.doubleToDec(0) ;
         n11642TaesCant = false ;
         n2144UniEstCod = false ;
         /* Using cursor P04NU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A11634TaesId, Short.valueOf(A11637TaesLn), Short.valueOf(A11641TaesLnP), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n11642TaesCant), A11642TaesCant, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES02");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A11634TaesId = W11634TaesId ;
         A11637TaesLn = W11637TaesLn ;
         A11641TaesLnP = W11641TaesLnP ;
         A719PrdNum = W719PrdNum ;
         n719PrdNum = false ;
         A11642TaesCant = W11642TaesCant ;
         n11642TaesCant = false ;
         A2144UniEstCod = W2144UniEstCod ;
         n2144UniEstCod = false ;
         /* End Insert */
         AV14LastUlt = A11637TaesLn ;
         A396EmprCod = W396EmprCod ;
         A11634TaesId = W11634TaesId ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptaes01.this.A396EmprCod;
      this.aP1[0] = pptaes01.this.AV17TaesId;
      this.aP2[0] = pptaes01.this.AV18TaesDc;
      this.aP3[0] = pptaes01.this.AV19TaesLn;
      this.aP4[0] = pptaes01.this.AV20TaesVi;
      this.aP5[0] = pptaes01.this.AV21TaesVf;
      this.aP6[0] = pptaes01.this.AV22TaesLnP;
      this.aP7[0] = pptaes01.this.AV22TaesLnP;
      Application.commitDataStores(context, remoteHandle, pr_default, "pptaes01");
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
      P04NU2_A396EmprCod = new String[] {""} ;
      P04NU2_A11634TaesId = new String[] {""} ;
      P04NU2_A11642TaesCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NU2_n11642TaesCant = new boolean[] {false} ;
      P04NU2_A11637TaesLn = new short[1] ;
      P04NU2_A2144UniEstCod = new String[] {""} ;
      P04NU2_n2144UniEstCod = new boolean[] {false} ;
      P04NU2_A719PrdNum = new String[] {""} ;
      P04NU2_n719PrdNum = new boolean[] {false} ;
      P04NU2_A11641TaesLnP = new short[1] ;
      A11634TaesId = "" ;
      A11642TaesCant = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A719PrdNum = "" ;
      W396EmprCod = "" ;
      W11634TaesId = "" ;
      W719PrdNum = "" ;
      W11642TaesCant = DecimalUtil.ZERO ;
      W2144UniEstCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptaes01__default(),
         new Object[] {
             new Object[] {
            P04NU2_A396EmprCod, P04NU2_A11634TaesId, P04NU2_A11642TaesCant, P04NU2_n11642TaesCant, P04NU2_A11637TaesLn, P04NU2_A2144UniEstCod, P04NU2_n2144UniEstCod, P04NU2_A719PrdNum, P04NU2_n719PrdNum, P04NU2_A11641TaesLnP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19TaesLn ;
   private short AV22TaesLnP ;
   private short AV14LastUlt ;
   private short A11637TaesLn ;
   private short A11641TaesLnP ;
   private short W11637TaesLn ;
   private short W11641TaesLnP ;
   private short Gx_err ;
   private int GX_INS1546 ;
   private java.math.BigDecimal AV20TaesVi ;
   private java.math.BigDecimal AV21TaesVf ;
   private java.math.BigDecimal A11642TaesCant ;
   private java.math.BigDecimal W11642TaesCant ;
   private String A396EmprCod ;
   private String AV17TaesId ;
   private String AV18TaesDc ;
   private String scmdbuf ;
   private String A11634TaesId ;
   private String A2144UniEstCod ;
   private String A719PrdNum ;
   private String W396EmprCod ;
   private String W11634TaesId ;
   private String W719PrdNum ;
   private String W2144UniEstCod ;
   private String Gx_emsg ;
   private boolean n11642TaesCant ;
   private boolean n2144UniEstCod ;
   private boolean n719PrdNum ;
   private short[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NU2_A396EmprCod ;
   private String[] P04NU2_A11634TaesId ;
   private java.math.BigDecimal[] P04NU2_A11642TaesCant ;
   private boolean[] P04NU2_n11642TaesCant ;
   private short[] P04NU2_A11637TaesLn ;
   private String[] P04NU2_A2144UniEstCod ;
   private boolean[] P04NU2_n2144UniEstCod ;
   private String[] P04NU2_A719PrdNum ;
   private boolean[] P04NU2_n719PrdNum ;
   private short[] P04NU2_A11641TaesLnP ;
}

final  class pptaes01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NU2", "SELECT EmprCod, TaesId, TaesCant, TaesLn, UniEstCod, PrdNum, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? and TaesId = ? ORDER BY EmprCod, TaesId, TaesLn DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04NU3", "INSERT INTO TXPTAES02(EmprCod, TaesId, TaesLn, TaesLnP, PrdNum, TaesCant, UniEstCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTAES02")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 3);
               }
               return;
      }
   }

}

