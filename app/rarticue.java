package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rarticue extends GXProcedure
{
   public rarticue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rarticue.class ), "" );
   }

   public rarticue( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      rarticue.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      rarticue.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rarticue.this.AV15ImpCod = aP1[0];
      this.aP1 = aP1;
      rarticue.this.AV45Clicod1 = aP2[0];
      this.aP2 = aP2;
      rarticue.this.AV46Clicod2 = aP3[0];
      this.aP3 = aP3;
      rarticue.this.AV47Artcod1 = aP4[0];
      this.aP4 = aP4;
      rarticue.this.AV48Artcod2 = aP5[0];
      this.aP5 = aP5;
      rarticue.this.AV38Archivo = aP6[0];
      this.aP6 = aP6;
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
      this.aP0[0] = rarticue.this.A396EmprCod;
      this.aP1[0] = rarticue.this.AV15ImpCod;
      this.aP2[0] = rarticue.this.AV45Clicod1;
      this.aP3[0] = rarticue.this.AV46Clicod2;
      this.aP4[0] = rarticue.this.AV47Artcod1;
      this.aP5[0] = rarticue.this.AV48Artcod2;
      this.aP6[0] = rarticue.this.AV38Archivo;
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
   private int AV45Clicod1 ;
   private int AV46Clicod2 ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV47Artcod1 ;
   private String AV48Artcod2 ;
   private String AV38Archivo ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

