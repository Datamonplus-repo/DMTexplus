package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmpreveresponsablesprompt", "/app.tmpreveresponsablesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreveresponsablesprompt extends GXWebObjectStub
{
   public tmpreveresponsablesprompt( )
   {
   }

   public tmpreveresponsablesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreveresponsablesprompt.class ));
   }

   public tmpreveresponsablesprompt( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreveresponsablesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreveresponsablesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Responsables";
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

