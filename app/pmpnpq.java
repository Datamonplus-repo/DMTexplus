package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmpnpq extends GXProcedure
{
   public pmpnpq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmpnpq.class ), "" );
   }

   public pmpnpq( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pmpnpq.this.aP2 = new String[] {""};
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
      pmpnpq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmpnpq.this.AV9macprocod = aP1[0];
      this.aP1 = aP1;
      pmpnpq.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P04GG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9macprocod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P04GG2_A764ProForCod[0] ;
         A766ProForDsc = P04GG2_A766ProForDsc[0] ;
         Gx_msg = httpContext.getMessage( "Atencion.Ya existe un Proceso quimico: ", "") + GXutil.trim( A764ProForCod) + " " + GXutil.trim( A766ProForDsc) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "con mismo Nº Programa ", "") + GXutil.trim( AV9macprocod) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmpnpq.this.A396EmprCod;
      this.aP1[0] = pmpnpq.this.AV9macprocod;
      this.aP2[0] = pmpnpq.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04GG2_A396EmprCod = new String[] {""} ;
      P04GG2_A764ProForCod = new String[] {""} ;
      P04GG2_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmpnpq__default(),
         new Object[] {
             new Object[] {
            P04GG2_A396EmprCod, P04GG2_A764ProForCod, P04GG2_A766ProForDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9macprocod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GG2_A396EmprCod ;
   private String[] P04GG2_A764ProForCod ;
   private String[] P04GG2_A766ProForDsc ;
}

final  class pmpnpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GG2", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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

