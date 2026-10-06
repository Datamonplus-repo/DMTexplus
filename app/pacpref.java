package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacpref extends GXProcedure
{
   public pacpref( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacpref.class ), "" );
   }

   public pacpref( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pacpref.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pacpref.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pacpref.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pacpref.this.AV17ForSer = aP2[0];
      this.aP2 = aP2;
      pacpref.this.AV18ForColNom = aP3[0];
      this.aP3 = aP3;
      pacpref.this.AV19ForColNum = aP4[0];
      this.aP4 = aP4;
      pacpref.this.AV20TipColCod = aP5[0];
      this.aP5 = aP5;
      pacpref.this.AV28ForNumCol = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00SC2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P00SC2_A831TipColCod[0] ;
         A483ForColNum = P00SC2_A483ForColNum[0] ;
         A482ForColNom = P00SC2_A482ForColNom[0] ;
         A494ForSer = P00SC2_A494ForSer[0] ;
         A252CliCod = P00SC2_A252CliCod[0] ;
         A396EmprCod = P00SC2_A396EmprCod[0] ;
         A486ForNumCol = P00SC2_A486ForNumCol[0] ;
         A492ForPreKgm = P00SC2_A492ForPreKgm[0] ;
         n492ForPreKgm = P00SC2_n492ForPreKgm[0] ;
         A493ForPreMtr = P00SC2_A493ForPreMtr[0] ;
         n493ForPreMtr = P00SC2_n493ForPreMtr[0] ;
         A491ForPreDef = P00SC2_A491ForPreDef[0] ;
         n491ForPreDef = P00SC2_n491ForPreDef[0] ;
         AV29ForPreKgm = A492ForPreKgm ;
         AV30ForPreMtr = A493ForPreMtr ;
         AV31ForPreDef = A491ForPreDef ;
         /* Execute user subroutine: 'FORMUL' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FORMUL' Routine */
      returnInSub = false ;
      /* Using cursor P00SC3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV28ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P00SC3_A486ForNumCol[0] ;
         A396EmprCod = P00SC3_A396EmprCod[0] ;
         A831TipColCod = P00SC3_A831TipColCod[0] ;
         A483ForColNum = P00SC3_A483ForColNum[0] ;
         A482ForColNom = P00SC3_A482ForColNom[0] ;
         A494ForSer = P00SC3_A494ForSer[0] ;
         A252CliCod = P00SC3_A252CliCod[0] ;
         A492ForPreKgm = P00SC3_A492ForPreKgm[0] ;
         n492ForPreKgm = P00SC3_n492ForPreKgm[0] ;
         A493ForPreMtr = P00SC3_A493ForPreMtr[0] ;
         n493ForPreMtr = P00SC3_n493ForPreMtr[0] ;
         A491ForPreDef = P00SC3_A491ForPreDef[0] ;
         n491ForPreDef = P00SC3_n491ForPreDef[0] ;
         if ( ( A252CliCod != AV16CliCod ) || ( GXutil.strcmp(A494ForSer, AV17ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, AV18ForColNom) != 0 ) || ( A483ForColNum != AV19ForColNum ) || ( A831TipColCod != AV20TipColCod ) )
         {
            A492ForPreKgm = AV29ForPreKgm ;
            n492ForPreKgm = false ;
            A493ForPreMtr = AV30ForPreMtr ;
            n493ForPreMtr = false ;
            A491ForPreDef = AV31ForPreDef ;
            n491ForPreDef = false ;
         }
         /* Using cursor P00SC4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n492ForPreKgm), A492ForPreKgm, Boolean.valueOf(n493ForPreMtr), A493ForPreMtr, Boolean.valueOf(n491ForPreDef), A491ForPreDef, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacpref.this.AV15EmprCod;
      this.aP1[0] = pacpref.this.AV16CliCod;
      this.aP2[0] = pacpref.this.AV17ForSer;
      this.aP3[0] = pacpref.this.AV18ForColNom;
      this.aP4[0] = pacpref.this.AV19ForColNum;
      this.aP5[0] = pacpref.this.AV20TipColCod;
      this.aP6[0] = pacpref.this.AV28ForNumCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacpref");
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
      P00SC2_A831TipColCod = new byte[1] ;
      P00SC2_A483ForColNum = new int[1] ;
      P00SC2_A482ForColNom = new String[] {""} ;
      P00SC2_A494ForSer = new String[] {""} ;
      P00SC2_A252CliCod = new int[1] ;
      P00SC2_A396EmprCod = new String[] {""} ;
      P00SC2_A486ForNumCol = new int[1] ;
      P00SC2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SC2_n492ForPreKgm = new boolean[] {false} ;
      P00SC2_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SC2_n493ForPreMtr = new boolean[] {false} ;
      P00SC2_A491ForPreDef = new String[] {""} ;
      P00SC2_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      AV29ForPreKgm = DecimalUtil.ZERO ;
      AV30ForPreMtr = DecimalUtil.ZERO ;
      AV31ForPreDef = "" ;
      P00SC3_A486ForNumCol = new int[1] ;
      P00SC3_A396EmprCod = new String[] {""} ;
      P00SC3_A831TipColCod = new byte[1] ;
      P00SC3_A483ForColNum = new int[1] ;
      P00SC3_A482ForColNom = new String[] {""} ;
      P00SC3_A494ForSer = new String[] {""} ;
      P00SC3_A252CliCod = new int[1] ;
      P00SC3_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SC3_n492ForPreKgm = new boolean[] {false} ;
      P00SC3_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SC3_n493ForPreMtr = new boolean[] {false} ;
      P00SC3_A491ForPreDef = new String[] {""} ;
      P00SC3_n491ForPreDef = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacpref__default(),
         new Object[] {
             new Object[] {
            P00SC2_A831TipColCod, P00SC2_A483ForColNum, P00SC2_A482ForColNom, P00SC2_A494ForSer, P00SC2_A252CliCod, P00SC2_A396EmprCod, P00SC2_A486ForNumCol, P00SC2_A492ForPreKgm, P00SC2_n492ForPreKgm, P00SC2_A493ForPreMtr,
            P00SC2_n493ForPreMtr, P00SC2_A491ForPreDef, P00SC2_n491ForPreDef
            }
            , new Object[] {
            P00SC3_A486ForNumCol, P00SC3_A396EmprCod, P00SC3_A831TipColCod, P00SC3_A483ForColNum, P00SC3_A482ForColNom, P00SC3_A494ForSer, P00SC3_A252CliCod, P00SC3_A492ForPreKgm, P00SC3_n492ForPreKgm, P00SC3_A493ForPreMtr,
            P00SC3_n493ForPreMtr, P00SC3_A491ForPreDef, P00SC3_n491ForPreDef
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int AV28ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal AV29ForPreKgm ;
   private java.math.BigDecimal AV30ForPreMtr ;
   private String AV15EmprCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A491ForPreDef ;
   private String AV31ForPreDef ;
   private boolean n492ForPreKgm ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean returnInSub ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00SC2_A831TipColCod ;
   private int[] P00SC2_A483ForColNum ;
   private String[] P00SC2_A482ForColNom ;
   private String[] P00SC2_A494ForSer ;
   private int[] P00SC2_A252CliCod ;
   private String[] P00SC2_A396EmprCod ;
   private int[] P00SC2_A486ForNumCol ;
   private java.math.BigDecimal[] P00SC2_A492ForPreKgm ;
   private boolean[] P00SC2_n492ForPreKgm ;
   private java.math.BigDecimal[] P00SC2_A493ForPreMtr ;
   private boolean[] P00SC2_n493ForPreMtr ;
   private String[] P00SC2_A491ForPreDef ;
   private boolean[] P00SC2_n491ForPreDef ;
   private int[] P00SC3_A486ForNumCol ;
   private String[] P00SC3_A396EmprCod ;
   private byte[] P00SC3_A831TipColCod ;
   private int[] P00SC3_A483ForColNum ;
   private String[] P00SC3_A482ForColNom ;
   private String[] P00SC3_A494ForSer ;
   private int[] P00SC3_A252CliCod ;
   private java.math.BigDecimal[] P00SC3_A492ForPreKgm ;
   private boolean[] P00SC3_n492ForPreKgm ;
   private java.math.BigDecimal[] P00SC3_A493ForPreMtr ;
   private boolean[] P00SC3_n493ForPreMtr ;
   private String[] P00SC3_A491ForPreDef ;
   private boolean[] P00SC3_n491ForPreDef ;
}

final  class pacpref__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00SC2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol, ForPreKgm, ForPreMtr, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00SC3", "SELECT ForNumCol, EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForPreKgm, ForPreMtr, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00SC4", "UPDATE TXPCFORMU SET ForPreKgm=?, ForPreMtr=?, ForPreDef=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 13);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               return;
      }
   }

}

