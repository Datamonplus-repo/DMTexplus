package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rpetcct extends GXProcedure
{
   public rpetcct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpetcct.class ), "" );
   }

   public rpetcct( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      rpetcct.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      rpetcct.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rpetcct.this.A8585Pet_cod = aP1[0];
      this.aP1 = aP1;
      rpetcct.this.AV44Planom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rpetcct.this.A396EmprCod;
      this.aP1[0] = rpetcct.this.A8585Pet_cod;
      this.aP2[0] = rpetcct.this.AV44Planom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A8585Pet_cod ;
   private String A396EmprCod ;
   private String AV44Planom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
}

