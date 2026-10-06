package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class reorganizoforultlin extends GXProcedure
{
   public reorganizoforultlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorganizoforultlin.class ), "" );
   }

   public reorganizoforultlin( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        String aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String aP7 )
   {
      reorganizoforultlin.this.A396EmprCod = aP0;
      reorganizoforultlin.this.A252CliCod = aP1;
      reorganizoforultlin.this.A494ForSer = aP2;
      reorganizoforultlin.this.A482ForColNom = aP3;
      reorganizoforultlin.this.A483ForColNum = aP4;
      reorganizoforultlin.this.A831TipColCod = aP5;
      reorganizoforultlin.this.AV9usurcod = aP6;
      reorganizoforultlin.this.AV10Station = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProForL = (short)(0) ;
      /* Using cursor P0ADE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1160ProForL = P0ADE2_A1160ProForL[0] ;
         AV8ProForL = A1160ProForL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11inc_obs = "" ;
      /* Using cursor P0ADE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1159ForUltLin = P0ADE3_A1159ForUltLin[0] ;
         n1159ForUltLin = P0ADE3_n1159ForUltLin[0] ;
         AV11inc_obs = httpContext.getMessage( "Actualizo ForUltLin = ", "") + GXutil.trim( GXutil.str( A1159ForUltLin, 4, 0)) + httpContext.getMessage( " con nuevo valor ", "") + GXutil.trim( GXutil.str( AV8ProForL, 4, 0)) ;
         A1159ForUltLin = AV8ProForL ;
         n1159ForUltLin = false ;
         /* Using cursor P0ADE4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV11inc_obs, "") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV9usurcod, AV10Station, AV11inc_obs, 12345678, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.reorganizoforultlin");
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
      P0ADE2_A396EmprCod = new String[] {""} ;
      P0ADE2_A252CliCod = new int[1] ;
      P0ADE2_A494ForSer = new String[] {""} ;
      P0ADE2_A482ForColNom = new String[] {""} ;
      P0ADE2_A483ForColNum = new int[1] ;
      P0ADE2_A831TipColCod = new byte[1] ;
      P0ADE2_A1160ProForL = new short[1] ;
      AV11inc_obs = "" ;
      P0ADE3_A396EmprCod = new String[] {""} ;
      P0ADE3_A252CliCod = new int[1] ;
      P0ADE3_A494ForSer = new String[] {""} ;
      P0ADE3_A482ForColNom = new String[] {""} ;
      P0ADE3_A483ForColNum = new int[1] ;
      P0ADE3_A831TipColCod = new byte[1] ;
      P0ADE3_A1159ForUltLin = new short[1] ;
      P0ADE3_n1159ForUltLin = new boolean[] {false} ;
      AV16Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.reorganizoforultlin__default(),
         new Object[] {
             new Object[] {
            P0ADE2_A396EmprCod, P0ADE2_A252CliCod, P0ADE2_A494ForSer, P0ADE2_A482ForColNom, P0ADE2_A483ForColNum, P0ADE2_A831TipColCod, P0ADE2_A1160ProForL
            }
            , new Object[] {
            P0ADE3_A396EmprCod, P0ADE3_A252CliCod, P0ADE3_A494ForSer, P0ADE3_A482ForColNom, P0ADE3_A483ForColNum, P0ADE3_A831TipColCod, P0ADE3_A1159ForUltLin, P0ADE3_n1159ForUltLin
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "FormulacionTinte.ReorganizoForUltLin" ;
      /* GeneXus formulas. */
      AV16Pgmname = "FormulacionTinte.ReorganizoForUltLin" ;
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV8ProForL ;
   private short A1160ProForL ;
   private short A1159ForUltLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV9usurcod ;
   private String AV10Station ;
   private String scmdbuf ;
   private String AV16Pgmname ;
   private boolean n1159ForUltLin ;
   private String AV11inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADE2_A396EmprCod ;
   private int[] P0ADE2_A252CliCod ;
   private String[] P0ADE2_A494ForSer ;
   private String[] P0ADE2_A482ForColNom ;
   private int[] P0ADE2_A483ForColNum ;
   private byte[] P0ADE2_A831TipColCod ;
   private short[] P0ADE2_A1160ProForL ;
   private String[] P0ADE3_A396EmprCod ;
   private int[] P0ADE3_A252CliCod ;
   private String[] P0ADE3_A494ForSer ;
   private String[] P0ADE3_A482ForColNom ;
   private int[] P0ADE3_A483ForColNum ;
   private byte[] P0ADE3_A831TipColCod ;
   private short[] P0ADE3_A1159ForUltLin ;
   private boolean[] P0ADE3_n1159ForUltLin ;
}

final  class reorganizoforultlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADE2", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ADE3", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForUltLin FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0ADE4", "UPDATE TXPCFORMU SET ForUltLin=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

