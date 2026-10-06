package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalfas extends GXProcedure
{
   public pvalfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalfas.class ), "" );
   }

   public pvalfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pvalfas.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pvalfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvalfas.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pvalfas.this.AV14FasDsc = aP2[0];
      this.aP2 = aP2;
      pvalfas.this.AV13Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Flag = (byte)(0) ;
      /* Using cursor P01MS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A460FasDsc = P01MS2_A460FasDsc[0] ;
         AV14FasDsc = A460FasDsc ;
         AV13Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalfas.this.A396EmprCod;
      this.aP1[0] = pvalfas.this.A457FasCod;
      this.aP2[0] = pvalfas.this.AV14FasDsc;
      this.aP3[0] = pvalfas.this.AV13Flag;
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
      P01MS2_A396EmprCod = new String[] {""} ;
      P01MS2_A457FasCod = new String[] {""} ;
      P01MS2_A460FasDsc = new String[] {""} ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvalfas__default(),
         new Object[] {
             new Object[] {
            P01MS2_A396EmprCod, P01MS2_A457FasCod, P01MS2_A460FasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV14FasDsc ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MS2_A396EmprCod ;
   private String[] P01MS2_A457FasCod ;
   private String[] P01MS2_A460FasDsc ;
}

final  class pvalfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MS2", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

