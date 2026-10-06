package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.numerodeprogramaautomataprompt", "/app.formulaciontinte.numerodeprogramaautomataprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class numerodeprogramaautomataprompt extends GXWebObjectStub
{
   public numerodeprogramaautomataprompt( )
   {
   }

   public numerodeprogramaautomataprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( numerodeprogramaautomataprompt.class ));
   }

   public numerodeprogramaautomataprompt( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new numerodeprogramaautomataprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new numerodeprogramaautomataprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Numero de Programa Automata";
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

