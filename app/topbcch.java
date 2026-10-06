package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topbcch", "/app.topbcch"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topbcch extends GXWebObjectStub
{
   public topbcch( )
   {
   }

   public topbcch( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topbcch.class ));
   }

   public topbcch( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topbcch_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topbcch_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos Quimicos";
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

