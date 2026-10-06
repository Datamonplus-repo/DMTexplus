package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedaesartpre extends GXProcedure
{
   public ppedaesartpre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedaesartpre.class ), "" );
   }

   public ppedaesartpre( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            short[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 )
   {
      ppedaesartpre.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      ppedaesartpre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedaesartpre.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      ppedaesartpre.this.A11611PAFOrd = aP2[0];
      this.aP2 = aP2;
      ppedaesartpre.this.A457FasCod = aP3[0];
      this.aP3 = aP3;
      ppedaesartpre.this.A7727ArtAdiCod = aP4[0];
      this.aP4 = aP4;
      ppedaesartpre.this.AV16Devolver = aP5[0];
      this.aP5 = aP5;
      ppedaesartpre.this.AV17Sal = aP6[0];
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
      this.aP0[0] = ppedaesartpre.this.A396EmprCod;
      this.aP1[0] = ppedaesartpre.this.A11604PArtId;
      this.aP2[0] = ppedaesartpre.this.A11611PAFOrd;
      this.aP3[0] = ppedaesartpre.this.A457FasCod;
      this.aP4[0] = ppedaesartpre.this.A7727ArtAdiCod;
      this.aP5[0] = ppedaesartpre.this.AV16Devolver;
      this.aP6[0] = ppedaesartpre.this.AV17Sal;
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

   private short A11611PAFOrd ;
   private short A7727ArtAdiCod ;
   private short AV17Sal ;
   private short Gx_err ;
   private int A11604PArtId ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV16Devolver ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
}

