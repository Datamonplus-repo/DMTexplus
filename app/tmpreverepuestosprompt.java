package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmpreverepuestosprompt", "/app.tmpreverepuestosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreverepuestosprompt extends GXWebObjectStub
{
   public tmpreverepuestosprompt( )
   {
   }

   public tmpreverepuestosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreverepuestosprompt.class ));
   }

   public tmpreverepuestosprompt( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreverepuestosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreverepuestosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Repuestos";
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

