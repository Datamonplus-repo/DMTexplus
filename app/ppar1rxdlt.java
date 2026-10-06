package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppar1rxdlt extends GXProcedure
{
   public ppar1rxdlt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppar1rxdlt.class ), "" );
   }

   public ppar1rxdlt( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      ppar1rxdlt.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ppar1rxdlt.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      ppar1rxdlt.this.AV9PartCod = aP1[0];
      this.aP1 = aP1;
      ppar1rxdlt.this.AV10CliCod = aP2[0];
      this.aP2 = aP2;
      ppar1rxdlt.this.AV11PartLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02132 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9PartCod, Integer.valueOf(AV10CliCod), Integer.valueOf(AV11PartLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A979PartLin = P02132_A979PartLin[0] ;
         A252CliCod = P02132_A252CliCod[0] ;
         A966PartCod = P02132_A966PartCod[0] ;
         A396EmprCod = P02132_A396EmprCod[0] ;
         A982PartSitDis = P02132_A982PartSitDis[0] ;
         n982PartSitDis = P02132_n982PartSitDis[0] ;
         AV12PartCod1 = A982PartSitDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P02133 */
      pr_default.execute(1, new Object[] {AV8EmprCod, AV12PartCod1, Integer.valueOf(AV10CliCod), AV9PartCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppar1rxdlt.this.AV8EmprCod;
      this.aP1[0] = ppar1rxdlt.this.AV9PartCod;
      this.aP2[0] = ppar1rxdlt.this.AV10CliCod;
      this.aP3[0] = ppar1rxdlt.this.AV11PartLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppar1rxdlt");
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
      P02132_A979PartLin = new int[1] ;
      P02132_A252CliCod = new int[1] ;
      P02132_A966PartCod = new String[] {""} ;
      P02132_A396EmprCod = new String[] {""} ;
      P02132_A982PartSitDis = new String[] {""} ;
      P02132_n982PartSitDis = new boolean[] {false} ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A982PartSitDis = "" ;
      AV12PartCod1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppar1rxdlt__default(),
         new Object[] {
             new Object[] {
            P02132_A979PartLin, P02132_A252CliCod, P02132_A966PartCod, P02132_A396EmprCod, P02132_A982PartSitDis, P02132_n982PartSitDis
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10CliCod ;
   private int AV11PartLin ;
   private int A979PartLin ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String AV9PartCod ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A982PartSitDis ;
   private String AV12PartCod1 ;
   private boolean n982PartSitDis ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P02132_A979PartLin ;
   private int[] P02132_A252CliCod ;
   private String[] P02132_A966PartCod ;
   private String[] P02132_A396EmprCod ;
   private String[] P02132_A982PartSitDis ;
   private boolean[] P02132_n982PartSitDis ;
}

final  class ppar1rxdlt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02132", "SELECT PartLin, CliCod, PartCod, EmprCod, PartSitDis FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? and PartLin = ? ORDER BY EmprCod, PartCod, CliCod, PartLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02133", "DELETE FROM TXPLPARTI  WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartSitDis = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               return;
      }
   }

}

