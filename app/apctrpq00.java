package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apctrpq00 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apctrpq00 pgm = new apctrpq00 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apctrpq00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apctrpq00.class ), "" );
   }

   public apctrpq00( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV51UsurCod = " " ;
      AV52Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV50Emprcod ;
      GXv_char2[0] = AV53EmprNom ;
      GXv_char3[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char1, GXv_char2, GXv_char3) ;
      apctrpq00.this.AV50Emprcod = GXv_char1[0] ;
      apctrpq00.this.AV53EmprNom = GXv_char2[0] ;
      apctrpq00.this.AV51UsurCod = GXv_char3[0] ;
      GXt_char4 = AV54Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV50Emprcod, httpContext.getMessage( "CARPET", ""), GXv_char3) ;
      apctrpq00.this.GXt_char4 = GXv_char3[0] ;
      AV54Carpeta = GXt_char4 ;
      GXt_char4 = AV54Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apctrpq00.this.GXt_char4 = GXv_char3[0] ;
      AV54Carpeta = ((GXutil.strcmp("", AV54Carpeta)==0) ? GXt_char4 : AV54Carpeta) ;
      GXt_int5 = AV82Password ;
      GXv_char3[0] = AV50Emprcod ;
      GXv_char2[0] = httpContext.getMessage( "PSWAUD", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6) ;
      apctrpq00.this.AV50Emprcod = GXv_char3[0] ;
      apctrpq00.this.GXt_int5 = GXv_int6[0] ;
      AV82Password = (int)(GXt_int5) ;
      GXt_int7 = AV87Cotexsur ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV50Emprcod, httpContext.getMessage( "COTEXS", ""), GXv_int8) ;
      apctrpq00.this.GXt_int7 = GXv_int8[0] ;
      AV87Cotexsur = GXt_int7 ;
      if ( AV87Cotexsur == 0 )
      {
      }
      else
      {
         AV84Siacumular = httpContext.getMessage( "S", "") ;
      }
      if ( GXutil.strcmp(GXutil.upper( AV79ActDatos), httpContext.getMessage( "S", "")) == 0 )
      {
         AV79ActDatos = ((GXutil.strcmp(AV83OK, httpContext.getMessage( "S", ""))==0) ? AV79ActDatos : httpContext.getMessage( "N", "")) ;
      }
      GXv_char3[0] = AV50Emprcod ;
      GXv_char2[0] = AV74Prdnum1 ;
      GXv_char1[0] = AV73Prdnum2 ;
      GXv_char9[0] = AV54Carpeta ;
      GXv_char10[0] = AV79ActDatos ;
      GXv_char11[0] = AV84Siacumular ;
      new app.pctrpq01(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_char9, GXv_char10, GXv_char11) ;
      apctrpq00.this.AV50Emprcod = GXv_char3[0] ;
      apctrpq00.this.AV74Prdnum1 = GXv_char2[0] ;
      apctrpq00.this.AV73Prdnum2 = GXv_char1[0] ;
      apctrpq00.this.AV54Carpeta = GXv_char9[0] ;
      apctrpq00.this.AV79ActDatos = GXv_char10[0] ;
      apctrpq00.this.AV84Siacumular = GXv_char11[0] ;
      if ( GXutil.strcmp(GXutil.upper( AV79ActDatos), httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char11[0] = AV50Emprcod ;
         GXv_char10[0] = AV74Prdnum1 ;
         GXv_char9[0] = AV73Prdnum2 ;
         GXv_char3[0] = AV54Carpeta ;
         GXv_char2[0] = AV79ActDatos ;
         GXv_char1[0] = AV84Siacumular ;
         new app.pctrpq02(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char9, GXv_char3, GXv_char2, GXv_char1) ;
         apctrpq00.this.AV50Emprcod = GXv_char11[0] ;
         apctrpq00.this.AV74Prdnum1 = GXv_char10[0] ;
         apctrpq00.this.AV73Prdnum2 = GXv_char9[0] ;
         apctrpq00.this.AV54Carpeta = GXv_char3[0] ;
         apctrpq00.this.AV79ActDatos = GXv_char2[0] ;
         apctrpq00.this.AV84Siacumular = GXv_char1[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char11[0] = AV50Emprcod ;
         GXv_char10[0] = AV74Prdnum1 ;
         GXv_char9[0] = AV73Prdnum2 ;
         GXv_char3[0] = AV54Carpeta ;
         GXv_char2[0] = AV79ActDatos ;
         GXv_char1[0] = AV84Siacumular ;
         new app.pctrpq02(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char9, GXv_char3, GXv_char2, GXv_char1) ;
         apctrpq00.this.AV50Emprcod = GXv_char11[0] ;
         apctrpq00.this.AV74Prdnum1 = GXv_char10[0] ;
         apctrpq00.this.AV73Prdnum2 = GXv_char9[0] ;
         apctrpq00.this.AV54Carpeta = GXv_char3[0] ;
         apctrpq00.this.AV79ActDatos = GXv_char2[0] ;
         apctrpq00.this.AV84Siacumular = GXv_char1[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char11[0] = AV50Emprcod ;
         GXv_char10[0] = AV74Prdnum1 ;
         GXv_char9[0] = AV73Prdnum2 ;
         GXv_char3[0] = AV54Carpeta ;
         GXv_char2[0] = AV79ActDatos ;
         GXv_char1[0] = AV84Siacumular ;
         new app.pctrpq02(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char9, GXv_char3, GXv_char2, GXv_char1) ;
         apctrpq00.this.AV50Emprcod = GXv_char11[0] ;
         apctrpq00.this.AV74Prdnum1 = GXv_char10[0] ;
         apctrpq00.this.AV73Prdnum2 = GXv_char9[0] ;
         apctrpq00.this.AV54Carpeta = GXv_char3[0] ;
         apctrpq00.this.AV79ActDatos = GXv_char2[0] ;
         apctrpq00.this.AV84Siacumular = GXv_char1[0] ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         GXv_char11[0] = AV50Emprcod ;
         GXv_char10[0] = AV74Prdnum1 ;
         GXv_char9[0] = AV73Prdnum2 ;
         GXv_char3[0] = AV54Carpeta ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         GXv_char1[0] = AV84Siacumular ;
         new app.pctrpq01(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char9, GXv_char3, GXv_char2, GXv_char1) ;
         apctrpq00.this.AV50Emprcod = GXv_char11[0] ;
         apctrpq00.this.AV74Prdnum1 = GXv_char10[0] ;
         apctrpq00.this.AV73Prdnum2 = GXv_char9[0] ;
         apctrpq00.this.AV54Carpeta = GXv_char3[0] ;
         apctrpq00.this.AV84Siacumular = GXv_char1[0] ;
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pctrpq00.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51UsurCod = "" ;
      AV52Station = "" ;
      AV50Emprcod = "" ;
      AV53EmprNom = "" ;
      AV54Carpeta = "" ;
      GXt_char4 = "" ;
      GXv_int6 = new long[1] ;
      GXv_int8 = new byte[1] ;
      AV84Siacumular = "" ;
      AV79ActDatos = "" ;
      AV83OK = "" ;
      AV74Prdnum1 = "" ;
      AV73Prdnum2 = "" ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV87Cotexsur ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private int AV82Password ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String AV51UsurCod ;
   private String AV52Station ;
   private String AV50Emprcod ;
   private String AV53EmprNom ;
   private String AV54Carpeta ;
   private String GXt_char4 ;
   private String AV84Siacumular ;
   private String AV79ActDatos ;
   private String AV83OK ;
   private String AV74Prdnum1 ;
   private String AV73Prdnum2 ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
}

