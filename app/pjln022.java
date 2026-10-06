package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjln022 extends GXProcedure
{
   public pjln022( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjln022.class ), "" );
   }

   public pjln022( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Ajuste Cmacro(Lmacro)....", "") );
      AV34Count = 0 ;
      /* Using cursor P01EQ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P01EQ2_A1199MacCod[0] ;
         A396EmprCod = P01EQ2_A396EmprCod[0] ;
         A1200MacUltLin = P01EQ2_A1200MacUltLin[0] ;
         n1200MacUltLin = P01EQ2_n1200MacUltLin[0] ;
         AV35Flag_mac = (byte)(0) ;
         /* Using cursor P01EQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3366MacKgs = P01EQ3_A3366MacKgs[0] ;
            A1201MacLin = P01EQ3_A1201MacLin[0] ;
            AV35Flag_mac = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV35Flag_mac == 0 )
         {
            /* Using cursor P01EQ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
            AV34Count = (int)(AV34Count+1) ;
            Gx_msg = httpContext.getMessage( "Registros Eliminados= ", "") + GXutil.str( AV34Count, 6, 0) ;
            System.out.println( Gx_msg );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Ajuste Cmacro(Lmacro)....", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pjln022");
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
      P01EQ2_A1199MacCod = new int[1] ;
      P01EQ2_A396EmprCod = new String[] {""} ;
      P01EQ2_A1200MacUltLin = new short[1] ;
      P01EQ2_n1200MacUltLin = new boolean[] {false} ;
      A396EmprCod = "" ;
      P01EQ3_A396EmprCod = new String[] {""} ;
      P01EQ3_A1199MacCod = new int[1] ;
      P01EQ3_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01EQ3_A1201MacLin = new short[1] ;
      A3366MacKgs = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjln022__default(),
         new Object[] {
             new Object[] {
            P01EQ2_A1199MacCod, P01EQ2_A396EmprCod, P01EQ2_A1200MacUltLin, P01EQ2_n1200MacUltLin
            }
            , new Object[] {
            P01EQ3_A396EmprCod, P01EQ3_A1199MacCod, P01EQ3_A3366MacKgs, P01EQ3_A1201MacLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35Flag_mac ;
   private short A1200MacUltLin ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV34Count ;
   private int A1199MacCod ;
   private java.math.BigDecimal A3366MacKgs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private boolean n1200MacUltLin ;
   private IDataStoreProvider pr_default ;
   private int[] P01EQ2_A1199MacCod ;
   private String[] P01EQ2_A396EmprCod ;
   private short[] P01EQ2_A1200MacUltLin ;
   private boolean[] P01EQ2_n1200MacUltLin ;
   private String[] P01EQ3_A396EmprCod ;
   private int[] P01EQ3_A1199MacCod ;
   private java.math.BigDecimal[] P01EQ3_A3366MacKgs ;
   private short[] P01EQ3_A1201MacLin ;
}

final  class pjln022__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01EQ2", "SELECT MacCod, EmprCod, MacUltLin FROM TXPCMACRO ORDER BY EmprCod, MacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01EQ3", "SELECT EmprCod, MacCod, MacKgs, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01EQ4", "DELETE FROM TXPCMACRO  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

