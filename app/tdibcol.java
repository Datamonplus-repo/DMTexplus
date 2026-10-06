package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdibcol", "/app.tdibcol"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdibcol extends GXWebObjectStub
{
   public tdibcol( )
   {
   }

   public tdibcol( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdibcol.class ));
   }

   public tdibcol( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdibcol_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdibcol_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIBUJOS/ COLORES CLIENTE-Ribes";
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

