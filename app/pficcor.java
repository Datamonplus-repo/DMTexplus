package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pficcor extends GXProcedure
{
   public pficcor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pficcor.class ), "" );
   }

   public pficcor( int remoteHandle ,
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
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pficcor.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pficcor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pficcor.this.AV8ImpCod = aP1[0];
      this.aP1 = aP1;
      pficcor.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pficcor.this.A252CliCod = aP3[0];
      this.aP3 = aP3;
      pficcor.this.A494ForSer = aP4[0];
      this.aP4 = aP4;
      pficcor.this.A494ForSer = aP5[0];
      this.aP5 = aP5;
      pficcor.this.A483ForColNum = aP6[0];
      this.aP6 = aP6;
      pficcor.this.A483ForColNum = aP7[0];
      this.aP7 = aP7;
      pficcor.this.A482ForColNom = aP8[0];
      this.aP8 = aP8;
      pficcor.this.A482ForColNom = aP9[0];
      this.aP9 = aP9;
      pficcor.this.Gx_out = aP10[0];
      this.aP10 = aP10;
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
      this.aP0[0] = pficcor.this.A396EmprCod;
      this.aP1[0] = pficcor.this.AV8ImpCod;
      this.aP2[0] = pficcor.this.A252CliCod;
      this.aP3[0] = pficcor.this.A252CliCod;
      this.aP4[0] = pficcor.this.A494ForSer;
      this.aP5[0] = pficcor.this.A494ForSer;
      this.aP6[0] = pficcor.this.A483ForColNum;
      this.aP7[0] = pficcor.this.A483ForColNum;
      this.aP8[0] = pficcor.this.A482ForColNom;
      this.aP9[0] = pficcor.this.A482ForColNom;
      this.aP10[0] = pficcor.this.Gx_out;
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
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String Gx_out ;
   private String[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
}

