package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempparprompt", "/app.tempparprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempparprompt extends GXWebObjectStub
{
   public tempparprompt( )
   {
   }

   public tempparprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempparprompt.class ));
   }

   public tempparprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempparprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempparprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona PARAMETROS EMPRESA";
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

