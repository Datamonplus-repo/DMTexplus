package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmrprompt", "/app.tmordmrprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmrprompt extends GXWebObjectStub
{
   public tmordmrprompt( )
   {
   }

   public tmordmrprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmrprompt.class ));
   }

   public tmordmrprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmrprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmrprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Res Mano de Obra Orden Trabajo";
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

