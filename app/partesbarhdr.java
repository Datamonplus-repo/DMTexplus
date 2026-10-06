package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partesbarhdr extends GXProcedure
{
   public partesbarhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partesbarhdr.class ), "" );
   }

   public partesbarhdr( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      partesbarhdr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      partesbarhdr.this.AV9BarHdr = aP0;
      partesbarhdr.this.aP1 = aP1;
      partesbarhdr.this.aP2 = aP2;
      partesbarhdr.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40BarCod = 0 ;
      AV42BarCodReo = (byte)(0) ;
      AV41BarCodPar = "" ;
      if ( GXutil.len( AV9BarHdr) <= 10 )
      {
         AV40BarCod = (int)(GXutil.lval( GXutil.substring( AV9BarHdr, 1, 8))) ;
         AV42BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV9BarHdr, 9, 1))) ;
         AV41BarCodPar = ((GXutil.len( AV9BarHdr)==10) ? GXutil.substring( AV9BarHdr, 10, 1) : " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = partesbarhdr.this.AV40BarCod;
      this.aP2[0] = partesbarhdr.this.AV42BarCodReo;
      this.aP3[0] = partesbarhdr.this.AV41BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41BarCodPar = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42BarCodReo ;
   private short Gx_err ;
   private int AV40BarCod ;
   private String AV9BarHdr ;
   private String AV41BarCodPar ;
   private String[] aP3 ;
   private int[] aP1 ;
   private byte[] aP2 ;
}

