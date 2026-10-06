package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomataprocesosquimicosprompt", "/app.formulaciontinte.numerodeprogramaautomataprocesosquimicosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomataprocesosquimicosprompt extends GXWebObjectStub
{
   public numerodeprogramaautomataprocesosquimicosprompt( )
   {
   }

   public numerodeprogramaautomataprocesosquimicosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomataprocesosquimicosprompt.class ));
   }

   public numerodeprogramaautomataprocesosquimicosprompt( int remoteHandle ,
                                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomataprocesosquimicosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomataprocesosquimicosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Procesos Quimicos";
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

