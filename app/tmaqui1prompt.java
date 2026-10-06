package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqui1prompt", "/app.tmaqui1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqui1prompt extends GXWebObjectStub
{
   public tmaqui1prompt( )
   {
   }

   public tmaqui1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqui1prompt.class ));
   }

   public tmaqui1prompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqui1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqui1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MANTENIMIENTO MAQUINAS Basico";
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

