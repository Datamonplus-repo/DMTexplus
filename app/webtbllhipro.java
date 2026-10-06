package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webtbllhipro", "/app.webtbllhipro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webtbllhipro extends GXWebObjectStub
{
   public webtbllhipro( )
   {
   }

   public webtbllhipro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webtbllhipro.class ));
   }

   public webtbllhipro( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webtbllhipro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webtbllhipro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WEBtbl Lhipro";
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

