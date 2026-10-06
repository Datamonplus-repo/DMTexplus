package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topbcvto", "/app.topbcvto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topbcvto extends GXWebObjectStub
{
   public topbcvto( )
   {
   }

   public topbcvto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topbcvto.class ));
   }

   public topbcvto( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topbcvto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topbcvto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OP_FechaVto";
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

