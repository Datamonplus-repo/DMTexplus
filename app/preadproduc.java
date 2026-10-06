package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preadproduc extends GXProcedure
{
   public preadproduc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preadproduc.class ), "" );
   }

   public preadproduc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          short[] aP2 ,
                          java.math.BigDecimal[] aP3 )
   {
      preadproduc.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 )
   {
      preadproduc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preadproduc.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      preadproduc.this.AV9DVUltLinEnt = aP2[0];
      this.aP2 = aP2;
      preadproduc.this.AV10DVPrdPreAct = aP3[0];
      this.aP3 = aP3;
      preadproduc.this.AV11DVPrvNum = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04XS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11935DVPrdNum = P04XS2_A11935DVPrdNum[0] ;
         A12007DVUltLinEn = P04XS2_A12007DVUltLinEn[0] ;
         n12007DVUltLinEn = P04XS2_n12007DVUltLinEn[0] ;
         A12006DVPrdPreAc = P04XS2_A12006DVPrdPreAc[0] ;
         n12006DVPrdPreAc = P04XS2_n12006DVPrdPreAc[0] ;
         A12004DVPrvNum = P04XS2_A12004DVPrvNum[0] ;
         n12004DVPrvNum = P04XS2_n12004DVPrvNum[0] ;
         AV9DVUltLinEnt = (short)(A12007DVUltLinEn+1) ;
         AV10DVPrdPreAct = A12006DVPrdPreAc ;
         AV11DVPrvNum = A12004DVPrvNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preadproduc.this.A396EmprCod;
      this.aP1[0] = preadproduc.this.AV8PrdNum;
      this.aP2[0] = preadproduc.this.AV9DVUltLinEnt;
      this.aP3[0] = preadproduc.this.AV10DVPrdPreAct;
      this.aP4[0] = preadproduc.this.AV11DVPrvNum;
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
      P04XS2_A396EmprCod = new String[] {""} ;
      P04XS2_A11935DVPrdNum = new String[] {""} ;
      P04XS2_A12007DVUltLinEn = new short[1] ;
      P04XS2_n12007DVUltLinEn = new boolean[] {false} ;
      P04XS2_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XS2_n12006DVPrdPreAc = new boolean[] {false} ;
      P04XS2_A12004DVPrvNum = new int[1] ;
      P04XS2_n12004DVPrvNum = new boolean[] {false} ;
      A11935DVPrdNum = "" ;
      A12006DVPrdPreAc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preadproduc__default(),
         new Object[] {
             new Object[] {
            P04XS2_A396EmprCod, P04XS2_A11935DVPrdNum, P04XS2_A12007DVUltLinEn, P04XS2_n12007DVUltLinEn, P04XS2_A12006DVPrdPreAc, P04XS2_n12006DVPrdPreAc, P04XS2_A12004DVPrvNum, P04XS2_n12004DVPrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9DVUltLinEnt ;
   private short A12007DVUltLinEn ;
   private short Gx_err ;
   private int AV11DVPrvNum ;
   private int A12004DVPrvNum ;
   private java.math.BigDecimal AV10DVPrdPreAct ;
   private java.math.BigDecimal A12006DVPrdPreAc ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String scmdbuf ;
   private String A11935DVPrdNum ;
   private boolean n12007DVUltLinEn ;
   private boolean n12006DVPrdPreAc ;
   private boolean n12004DVPrvNum ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XS2_A396EmprCod ;
   private String[] P04XS2_A11935DVPrdNum ;
   private short[] P04XS2_A12007DVUltLinEn ;
   private boolean[] P04XS2_n12007DVUltLinEn ;
   private java.math.BigDecimal[] P04XS2_A12006DVPrdPreAc ;
   private boolean[] P04XS2_n12006DVPrdPreAc ;
   private int[] P04XS2_A12004DVPrvNum ;
   private boolean[] P04XS2_n12004DVPrvNum ;
}

final  class preadproduc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XS2", "SELECT Emprcod, Prdnum, UltLinEnt, PrdPreAct, PrvNum FROM LVNDVPRODUC WHERE Emprcod = ? and Prdnum = ? ORDER BY Emprcod, Prdnum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
      }
   }

}

