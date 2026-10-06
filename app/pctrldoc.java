package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrldoc extends GXProcedure
{
   public pctrldoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrldoc.class ), "" );
   }

   public pctrldoc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pctrldoc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pctrldoc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrldoc.this.AV14CumCodCont = aP1[0];
      this.aP1 = aP1;
      pctrldoc.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Contcod = "111111" ;
      AV13ContVal = 0 ;
      Gx_msg = "" ;
      /* Using cursor P05332 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV12Contcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P05332_A313ContCod[0] ;
         A316ContVal = P05332_A316ContVal[0] ;
         AV13ContVal = A316ContVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV14CumCodCont < AV13ContVal )
      {
         Gx_msg = httpContext.getMessage( "ERROR. Contador Salidas MANUALES = ", "") + GXutil.str( AV13ContVal, 8, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "N Documento introducido         = ", "") + GXutil.str( AV14CumCodCont, 8, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Intenta dar de alta de forma MANUAL un numero inferior al CONTADOR.", "") + GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrldoc.this.A396EmprCod;
      this.aP1[0] = pctrldoc.this.AV14CumCodCont;
      this.aP2[0] = pctrldoc.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Contcod = "" ;
      scmdbuf = "" ;
      P05332_A396EmprCod = new String[] {""} ;
      P05332_A313ContCod = new String[] {""} ;
      P05332_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrldoc__default(),
         new Object[] {
             new Object[] {
            P05332_A396EmprCod, P05332_A313ContCod, P05332_A316ContVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV14CumCodCont ;
   private int AV13ContVal ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV12Contcod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05332_A396EmprCod ;
   private String[] P05332_A313ContCod ;
   private int[] P05332_A316ContVal ;
}

final  class pctrldoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05332", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

