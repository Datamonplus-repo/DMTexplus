package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmmovstww", "/app.tmmovstww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstww extends GXWebObjectStub
{
   public tmmovstww( )
   {
   }

   public tmmovstww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstww.class ));
   }

   public tmmovstww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Movimientos de Stock";
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

