package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdbgl00 extends GXProcedure
{
   public pdbgl00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdbgl00.class ), "" );
   }

   public pdbgl00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdbgl00.this.aP1 = new int[] {0};
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
      pdbgl00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdbgl00.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03L22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8948Lb_NCoE = P03L22_A8948Lb_NCoE[0] ;
         A8949Lb_NOpE = P03L22_A8949Lb_NOpE[0] ;
         A8951Lb_FecE = P03L22_A8951Lb_FecE[0] ;
         AV14Lb_FecE = GXutil.nullDate() ;
         AV11Lb_NCoE = 0 ;
         AV12Lb_NOpE = 0 ;
         /* Using cursor P03L23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5567Lb_FechaEn = P03L23_A5567Lb_FechaEn[0] ;
            A5555Lb_opcion = P03L23_A5555Lb_opcion[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) )
            {
               AV11Lb_NCoE = 1 ;
               AV12Lb_NOpE = (int)(AV12Lb_NOpE+1) ;
               AV14Lb_FecE = A5567Lb_FechaEn ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A8948Lb_NCoE = AV11Lb_NCoE ;
         A8949Lb_NOpE = AV12Lb_NOpE ;
         A8951Lb_FecE = AV14Lb_FecE ;
         /* Using cursor P03L24 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A8948Lb_NCoE), Integer.valueOf(A8949Lb_NOpE), A8951Lb_FecE, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdbgl00.this.A396EmprCod;
      this.aP1[0] = pdbgl00.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pdbgl00");
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
      P03L22_A396EmprCod = new String[] {""} ;
      P03L22_A5532Lb_numero = new int[1] ;
      P03L22_A8948Lb_NCoE = new int[1] ;
      P03L22_A8949Lb_NOpE = new int[1] ;
      P03L22_A8951Lb_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      A8951Lb_FecE = GXutil.nullDate() ;
      AV14Lb_FecE = GXutil.nullDate() ;
      P03L23_A396EmprCod = new String[] {""} ;
      P03L23_A5532Lb_numero = new int[1] ;
      P03L23_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P03L23_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pdbgl00__default(),
         new Object[] {
             new Object[] {
            P03L22_A396EmprCod, P03L22_A5532Lb_numero, P03L22_A8948Lb_NCoE, P03L22_A8949Lb_NOpE, P03L22_A8951Lb_FecE
            }
            , new Object[] {
            P03L23_A396EmprCod, P03L23_A5532Lb_numero, P03L23_A5567Lb_FechaEn, P03L23_A5555Lb_opcion
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
   private int A8948Lb_NCoE ;
   private int A8949Lb_NOpE ;
   private int AV11Lb_NCoE ;
   private int AV12Lb_NOpE ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private java.util.Date A8951Lb_FecE ;
   private java.util.Date AV14Lb_FecE ;
   private java.util.Date A5567Lb_FechaEn ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L22_A396EmprCod ;
   private int[] P03L22_A5532Lb_numero ;
   private int[] P03L22_A8948Lb_NCoE ;
   private int[] P03L22_A8949Lb_NOpE ;
   private java.util.Date[] P03L22_A8951Lb_FecE ;
   private String[] P03L23_A396EmprCod ;
   private int[] P03L23_A5532Lb_numero ;
   private java.util.Date[] P03L23_A5567Lb_FechaEn ;
   private String[] P03L23_A5555Lb_opcion ;
}

final  class pdbgl00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L22", "SELECT EmprCod, Lb_numero, Lb_NCoE, Lb_NOpE, Lb_FecE FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03L23", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L24", "UPDATE TXPENS001 SET Lb_NCoE=?, Lb_NOpE=?, Lb_FecE=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

