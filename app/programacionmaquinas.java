package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.programacionmaquinas", "/app.programacionmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programacionmaquinas extends GXWebObjectStub
{
   public programacionmaquinas( )
   {
   }

   public programacionmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programacionmaquinas.class ));
   }

   public programacionmaquinas( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.programacionmaquinas_impl pgm = new app.programacionmaquinas_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programacionmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programacionmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programacion Maquinas";
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

