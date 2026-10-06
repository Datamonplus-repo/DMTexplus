package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txtooco", "/app.txtooco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txtooco extends GXWebObjectStub
{
   public txtooco( )
   {
   }

   public txtooco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txtooco.class ));
   }

   public txtooco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txtooco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txtooco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Compra de Totvs.";
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

