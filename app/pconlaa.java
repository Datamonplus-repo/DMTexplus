package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconlaa extends GXProcedure
{
   public pconlaa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconlaa.class ), "" );
   }

   public pconlaa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pconlaa.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pconlaa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconlaa.this.AV15UsurCod = aP1[0];
      this.aP1 = aP1;
      pconlaa.this.AV16BarSua = aP2[0];
      this.aP2 = aP2;
      pconlaa.this.AV17Impre = aP3[0];
      this.aP3 = aP3;
      pconlaa.this.AV58RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pconlaa.this.AV61TinTip = aP5[0];
      this.aP5 = aP5;
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
      this.aP0[0] = pconlaa.this.A396EmprCod;
      this.aP1[0] = pconlaa.this.AV15UsurCod;
      this.aP2[0] = pconlaa.this.AV16BarSua;
      this.aP3[0] = pconlaa.this.AV17Impre;
      this.aP4[0] = pconlaa.this.AV58RecLinMaq;
      this.aP5[0] = pconlaa.this.AV61TinTip;
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

   private short AV58RecLinMaq ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15UsurCod ;
   private String AV16BarSua ;
   private String AV17Impre ;
   private String AV61TinTip ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
}

