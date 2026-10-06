package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pruebasmatrizgeneraarchivo", "/app.pruebasmatrizgeneraarchivo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pruebasmatrizgeneraarchivo extends GXWebObjectStub
{
   public pruebasmatrizgeneraarchivo( )
   {
   }

   public pruebasmatrizgeneraarchivo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pruebasmatrizgeneraarchivo.class ));
   }

   public pruebasmatrizgeneraarchivo( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.pruebasmatrizgeneraarchivo_impl pgm = new app.pruebasmatrizgeneraarchivo_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pruebasmatrizgeneraarchivo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pruebasmatrizgeneraarchivo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pruebas Matriz Genera Archivo";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

