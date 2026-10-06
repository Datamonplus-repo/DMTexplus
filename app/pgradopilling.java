package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgradopilling extends GXProcedure
{
   public pgradopilling( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgradopilling.class ), "" );
   }

   public pgradopilling( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pgradopilling.this.aP2 = new String[] {""};
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
      pgradopilling.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgradopilling.this.AV23SolPilCod = aP1[0];
      this.aP1 = aP1;
      pgradopilling.this.AV15SolPilGra = aP2[0];
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
      this.aP0[0] = pgradopilling.this.A396EmprCod;
      this.aP1[0] = pgradopilling.this.AV23SolPilCod;
      this.aP2[0] = pgradopilling.this.AV15SolPilGra;
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
   private int AV23SolPilCod ;
   private String A396EmprCod ;
   private String AV15SolPilGra ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
}

