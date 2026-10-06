package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasdsc extends GXProcedure
{
   public pfasdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasdsc.class ), "" );
   }

   public pfasdsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pfasdsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      pfasdsc.this.A396EmprCod = aP0;
      pfasdsc.this.A457FasCod = aP1;
      pfasdsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FasDsc = " " ;
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P00BE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A460FasDsc = P00BE2_A460FasDsc[0] ;
         AV18GXLvl2 = (byte)(1) ;
         AV15FasDsc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         if ( GXutil.strcmp(A457FasCod, " ") != 0 )
         {
            AV15FasDsc = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pfasdsc.this.AV15FasDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15FasDsc = "" ;
      scmdbuf = "" ;
      P00BE2_A396EmprCod = new String[] {""} ;
      P00BE2_A457FasCod = new String[] {""} ;
      P00BE2_A460FasDsc = new String[] {""} ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasdsc__default(),
         new Object[] {
             new Object[] {
            P00BE2_A396EmprCod, P00BE2_A457FasCod, P00BE2_A460FasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV15FasDsc ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00BE2_A396EmprCod ;
   private String[] P00BE2_A457FasCod ;
   private String[] P00BE2_A460FasDsc ;
}

final  class pfasdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00BE2", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

