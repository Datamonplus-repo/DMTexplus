package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcostef1 extends GXProcedure
{
   public pcostef1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcostef1.class ), "" );
   }

   public pcostef1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 )
   {
      pcostef1.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pcostef1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcostef1.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcostef1.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pcostef1.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pcostef1.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pcostef1.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pcostef1.this.AV31Opcion = aP6[0];
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
      this.aP0[0] = pcostef1.this.A396EmprCod;
      this.aP1[0] = pcostef1.this.A252CliCod;
      this.aP2[0] = pcostef1.this.A494ForSer;
      this.aP3[0] = pcostef1.this.A482ForColNom;
      this.aP4[0] = pcostef1.this.A483ForColNum;
      this.aP5[0] = pcostef1.this.A831TipColCod;
      this.aP6[0] = pcostef1.this.AV31Opcion;
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

   private byte A831TipColCod ;
   private byte AV31Opcion ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
}

