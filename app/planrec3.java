package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class planrec3 extends GXProcedure
{
   public planrec3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planrec3.class ), "" );
   }

   public planrec3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 )
   {
      planrec3.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      planrec3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planrec3.this.AV41BarCod = aP1[0];
      this.aP1 = aP1;
      planrec3.this.AV42BarCodReo = aP2[0];
      this.aP2 = aP2;
      planrec3.this.AV43BarCodPar = aP3[0];
      this.aP3 = aP3;
      planrec3.this.AV15RecLinMaq = aP4[0];
      this.aP4 = aP4;
      planrec3.this.AV45StatSedo = aP5[0];
      this.aP5 = aP5;
      planrec3.this.AV48FlagOpe = aP6[0];
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
      this.aP0[0] = planrec3.this.A396EmprCod;
      this.aP1[0] = planrec3.this.AV41BarCod;
      this.aP2[0] = planrec3.this.AV42BarCodReo;
      this.aP3[0] = planrec3.this.AV43BarCodPar;
      this.aP4[0] = planrec3.this.AV15RecLinMaq;
      this.aP5[0] = planrec3.this.AV45StatSedo;
      this.aP6[0] = planrec3.this.AV48FlagOpe;
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

   private byte AV42BarCodReo ;
   private byte AV45StatSedo ;
   private short AV15RecLinMaq ;
   private short Gx_err ;
   private int AV41BarCod ;
   private String A396EmprCod ;
   private String AV43BarCodPar ;
   private String AV48FlagOpe ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
}

