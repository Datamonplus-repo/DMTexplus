package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumalm extends GXProcedure
{
   public pnumalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumalm.class ), "" );
   }

   public pnumalm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pnumalm.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 )
   {
      pnumalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumalm.this.AV18AlmChar = aP1[0];
      this.aP1 = aP1;
      pnumalm.this.AV19Num_alb = aP2[0];
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
      this.aP0[0] = pnumalm.this.A396EmprCod;
      this.aP1[0] = pnumalm.this.AV18AlmChar;
      this.aP2[0] = pnumalm.this.AV19Num_alb;
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
   private long AV19Num_alb ;
   private String A396EmprCod ;
   private String AV18AlmChar ;
   private long[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

