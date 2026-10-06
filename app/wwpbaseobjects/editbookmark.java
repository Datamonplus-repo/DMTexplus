package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.editbookmark", "/app.wwpbaseobjects.editbookmark"})
@jakarta.servlet.annotation.MultipartConfig
public final  class editbookmark extends GXWebObjectStub
{
   public editbookmark( )
   {
   }

   public editbookmark( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( editbookmark.class ));
   }

   public editbookmark( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new editbookmark_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new editbookmark_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Add/Edit Bookmark";
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

