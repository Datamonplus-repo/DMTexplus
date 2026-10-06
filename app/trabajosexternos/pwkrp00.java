package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.pwkrp00", "/app.trabajosexternos.pwkrp00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pwkrp00 extends GXWebObjectStub
{
   public pwkrp00( )
   {
   }

   public pwkrp00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pwkrp00.class ));
   }

   public pwkrp00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pwkrp00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pwkrp00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Trabajos Externos (Recepcion)";
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

