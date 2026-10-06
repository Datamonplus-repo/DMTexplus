package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasdsc2 extends GXProcedure
{
   public pfasdsc2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasdsc2.class ), "" );
   }

   public pfasdsc2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pfasdsc2.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pfasdsc2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasdsc2.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pfasdsc2.this.AV8FasDsc2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasDsc2 = "" ;
      /* Using cursor P01YR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4642FasDsc2 = P01YR2_A4642FasDsc2[0] ;
         n4642FasDsc2 = P01YR2_n4642FasDsc2[0] ;
         AV8FasDsc2 = A4642FasDsc2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasdsc2.this.A396EmprCod;
      this.aP1[0] = pfasdsc2.this.A457FasCod;
      this.aP2[0] = pfasdsc2.this.AV8FasDsc2;
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
      P01YR2_A396EmprCod = new String[] {""} ;
      P01YR2_A457FasCod = new String[] {""} ;
      P01YR2_A4642FasDsc2 = new String[] {""} ;
      P01YR2_n4642FasDsc2 = new boolean[] {false} ;
      A4642FasDsc2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasdsc2__default(),
         new Object[] {
             new Object[] {
            P01YR2_A396EmprCod, P01YR2_A457FasCod, P01YR2_A4642FasDsc2, P01YR2_n4642FasDsc2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV8FasDsc2 ;
   private String scmdbuf ;
   private String A4642FasDsc2 ;
   private boolean n4642FasDsc2 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YR2_A396EmprCod ;
   private String[] P01YR2_A457FasCod ;
   private String[] P01YR2_A4642FasDsc2 ;
   private boolean[] P01YR2_n4642FasDsc2 ;
}

final  class pfasdsc2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YR2", "SELECT EmprCod, FasCod, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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

