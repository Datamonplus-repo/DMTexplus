package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdbgl01 extends GXProcedure
{
   public pdbgl01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdbgl01.class ), "" );
   }

   public pdbgl01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdbgl01.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pdbgl01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdbgl01.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03L32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8950Lb_NOpN = P03L32_A8950Lb_NOpN[0] ;
         A8952Lb_FecN = P03L32_A8952Lb_FecN[0] ;
         AV15Lb_FecN = GXutil.nullDate() ;
         AV13Lb_NOpN = 0 ;
         /* Using cursor P03L33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6461Lb_FecNoa1 = P03L33_A6461Lb_FecNoa1[0] ;
            A5555Lb_opcion = P03L33_A5555Lb_opcion[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
               AV13Lb_NOpN = (int)(AV13Lb_NOpN+1) ;
               AV15Lb_FecN = A6461Lb_FecNoa1 ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A8950Lb_NOpN = AV13Lb_NOpN ;
         A8952Lb_FecN = AV15Lb_FecN ;
         /* Using cursor P03L34 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A8950Lb_NOpN), A8952Lb_FecN, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdbgl01.this.A396EmprCod;
      this.aP1[0] = pdbgl01.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pdbgl01");
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
      P03L32_A396EmprCod = new String[] {""} ;
      P03L32_A5532Lb_numero = new int[1] ;
      P03L32_A8950Lb_NOpN = new int[1] ;
      P03L32_A8952Lb_FecN = new java.util.Date[] {GXutil.nullDate()} ;
      A8952Lb_FecN = GXutil.nullDate() ;
      AV15Lb_FecN = GXutil.nullDate() ;
      P03L33_A396EmprCod = new String[] {""} ;
      P03L33_A5532Lb_numero = new int[1] ;
      P03L33_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P03L33_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pdbgl01__default(),
         new Object[] {
             new Object[] {
            P03L32_A396EmprCod, P03L32_A5532Lb_numero, P03L32_A8950Lb_NOpN, P03L32_A8952Lb_FecN
            }
            , new Object[] {
            P03L33_A396EmprCod, P03L33_A5532Lb_numero, P03L33_A6461Lb_FecNoa1, P03L33_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private int A8950Lb_NOpN ;
   private int AV13Lb_NOpN ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private java.util.Date A8952Lb_FecN ;
   private java.util.Date AV15Lb_FecN ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L32_A396EmprCod ;
   private int[] P03L32_A5532Lb_numero ;
   private int[] P03L32_A8950Lb_NOpN ;
   private java.util.Date[] P03L32_A8952Lb_FecN ;
   private String[] P03L33_A396EmprCod ;
   private int[] P03L33_A5532Lb_numero ;
   private java.util.Date[] P03L33_A6461Lb_FecNoa1 ;
   private String[] P03L33_A5555Lb_opcion ;
}

final  class pdbgl01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L32", "SELECT EmprCod, Lb_numero, Lb_NOpN, Lb_FecN FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03L33", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L34", "UPDATE TXPENS001 SET Lb_NOpN=?, Lb_FecN=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

