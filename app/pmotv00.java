package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmotv00 extends GXProcedure
{
   public pmotv00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmotv00.class ), "" );
   }

   public pmotv00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 )
   {
      AV9Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV9Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, AV9Tab_maq);
      return AV9Tab_maq;
   }

   public void execute( String[] aP0 ,
                        String[] AV9Tab_maq )
   {
      execute_int(aP0, AV9Tab_maq);
   }

   private void execute_int( String[] aP0 ,
                             String[] AV9Tab_maq )
   {
      pmotv00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmotv00.this.AV9Tab_maq = AV9Tab_maq;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8x = (short)(0) ;
      /* Using cursor P084P2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9426OMMaqCod = P084P2_A9426OMMaqCod[0] ;
         AV8x = (short)(AV8x+1) ;
         AV9Tab_maq[AV8x-1] = A9426OMMaqCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmotv00.this.A396EmprCod;
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
      P084P2_A396EmprCod = new String[] {""} ;
      P084P2_A9426OMMaqCod = new String[] {""} ;
      A9426OMMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmotv00__default(),
         new Object[] {
             new Object[] {
            P084P2_A396EmprCod, P084P2_A9426OMMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8x ;
   private short Gx_err ;
   private int GX_I ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9426OMMaqCod ;
   private String[] AV9Tab_maq ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P084P2_A396EmprCod ;
   private String[] P084P2_A9426OMMaqCod ;
}

final  class pmotv00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084P2", "SELECT DISTINCT NULL AS EmprCod, OMMaqCod FROM ( SELECT EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? ORDER BY EmprCod, OMMaqCod) DistinctT ORDER BY OMMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

