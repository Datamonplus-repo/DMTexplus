package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconlan extends GXProcedure
{
   public pconlan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconlan.class ), "" );
   }

   public pconlan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pconlan.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pconlan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconlan.this.AV15UsurCod = aP1[0];
      this.aP1 = aP1;
      pconlan.this.AV16BarSua = aP2[0];
      this.aP2 = aP2;
      pconlan.this.AV17Impre = aP3[0];
      this.aP3 = aP3;
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
      this.aP0[0] = pconlan.this.A396EmprCod;
      this.aP1[0] = pconlan.this.AV15UsurCod;
      this.aP2[0] = pconlan.this.AV16BarSua;
      this.aP3[0] = pconlan.this.AV17Impre;
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
   private String A396EmprCod ;
   private String AV15UsurCod ;
   private String AV16BarSua ;
   private String AV17Impre ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
}

