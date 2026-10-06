package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasproww", "/app.tfasproww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasproww extends GXWebObjectStub
{
   public tfasproww( )
   {
   }

   public tfasproww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasproww.class ));
   }

   public tfasproww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasproww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasproww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " FASES";
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

