package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfubi extends GXProcedure
{
   public pinfubi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfubi.class ), "" );
   }

   public pinfubi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pinfubi.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pinfubi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinfubi.this.AV10Emp_cub = aP1[0];
      this.aP1 = aP1;
      pinfubi.this.AV17Emp_anp = aP2[0];
      this.aP2 = aP2;
      pinfubi.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Tot_pd = 0 ;
      Gx_msg = " " ;
      /* Using cursor P03T22 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10Emp_cub});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9743Emp_CUb = P03T22_A9743Emp_CUb[0] ;
         A9751Emp_PzU = P03T22_A9751Emp_PzU[0] ;
         n9751Emp_PzU = P03T22_n9751Emp_PzU[0] ;
         A9745Emp_PzE = P03T22_A9745Emp_PzE[0] ;
         n9745Emp_PzE = P03T22_n9745Emp_PzE[0] ;
         A5860Emp_Anp = P03T22_A5860Emp_Anp[0] ;
         A44AlbRecCod = P03T22_A44AlbRecCod[0] ;
         AV15Tot_pd = (int)(AV15Tot_pd+(A9745Emp_PzE-A9751Emp_PzU)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15Tot_pd > 0 )
      {
         Gx_msg = httpContext.getMessage( "Hay Informacion en ", "") + AV10Emp_cub + "-" + GXutil.chr( (short)(13)) ;
      }
      if ( GXutil.strcmp(Gx_msg, " ") != 0 )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinfubi.this.A396EmprCod;
      this.aP1[0] = pinfubi.this.AV10Emp_cub;
      this.aP2[0] = pinfubi.this.AV17Emp_anp;
      this.aP3[0] = pinfubi.this.Gx_msg;
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
      P03T22_A396EmprCod = new String[] {""} ;
      P03T22_A9743Emp_CUb = new String[] {""} ;
      P03T22_A9751Emp_PzU = new int[1] ;
      P03T22_n9751Emp_PzU = new boolean[] {false} ;
      P03T22_A9745Emp_PzE = new int[1] ;
      P03T22_n9745Emp_PzE = new boolean[] {false} ;
      P03T22_A5860Emp_Anp = new short[1] ;
      P03T22_A44AlbRecCod = new int[1] ;
      A9743Emp_CUb = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfubi__default(),
         new Object[] {
             new Object[] {
            P03T22_A396EmprCod, P03T22_A9743Emp_CUb, P03T22_A9751Emp_PzU, P03T22_n9751Emp_PzU, P03T22_A9745Emp_PzE, P03T22_n9745Emp_PzE, P03T22_A5860Emp_Anp, P03T22_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17Emp_anp ;
   private short A5860Emp_Anp ;
   private short Gx_err ;
   private int AV15Tot_pd ;
   private int A9751Emp_PzU ;
   private int A9745Emp_PzE ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV10Emp_cub ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A9743Emp_CUb ;
   private boolean n9751Emp_PzU ;
   private boolean n9745Emp_PzE ;
   private boolean returnInSub ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03T22_A396EmprCod ;
   private String[] P03T22_A9743Emp_CUb ;
   private int[] P03T22_A9751Emp_PzU ;
   private boolean[] P03T22_n9751Emp_PzU ;
   private int[] P03T22_A9745Emp_PzE ;
   private boolean[] P03T22_n9745Emp_PzE ;
   private short[] P03T22_A5860Emp_Anp ;
   private int[] P03T22_A44AlbRecCod ;
}

final  class pinfubi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03T22", "SELECT EmprCod, Emp_CUb, Emp_PzU, Emp_PzE, Emp_Anp, AlbRecCod FROM TXPUBIIN WHERE EmprCod = ? and Emp_CUb = ? ORDER BY EmprCod, Emp_CUb, Emp_Anp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

